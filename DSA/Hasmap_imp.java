import java.util.*;

public class HashMapImp {

    static class HashMap<k, v> { // Generics

        static class Node<k, v> {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes
        private int N; // number of buckets
        private LinkedList<Node<k, v>> buckets[]; // array of linked lists (buckets)

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key) {
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % N; // map hashCode to bucket index
        }

        private int searchInLL(k key, int bi) {
            LinkedList<Node<k, v>> bucket = buckets[bi];

            for (int i = 0; i < bucket.size(); i++) {
                Node<k, v> node = bucket.get(i);
                if (node.key.equals(key)) {
                    return i; // key found, return index
                }
            }
            return -1; // key not found
        }

        public void put(k key, v value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index in the linked list

            if (di == -1) { // key doesn't exist
                buckets[bi].add(new Node<>(key, value));
                n++;
            } else { // key exists, update value
                Node<k, v> node = buckets[bi].get(di);
                node.value = value;
            }

            // Rehashing if the load factor exceeds 2.0
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        private void rehash() {
            LinkedList<Node<k, v>> oldBuckets[] = buckets;
            N = N * 2; // double the number of buckets
            buckets = new LinkedList[N]; // create new buckets

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0; // reset node count

            // Rehashing: insert old elements into new bucket array
            for (LinkedList<Node<k, v>> bucket : oldBuckets) {
                for (Node<k, v> node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public v get(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exists, return value
                Node<k, v> node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1; // return true if key exists
        }

        public v remove(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exists, remove and return value
                Node<k, v> node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public int size() {
            return n;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("mango", 3);
        map.put("grapes", 4);

        System.out.println("Mango Value: " + map.get("mango"));
        System.out.println("Contains 'banana'? " + map.containsKey("banana"));
        System.out.println("Removed 'banana': " + map.remove("banana"));
        System.out.println("Contains 'banana'? " + map.containsKey("banana"));
        System.out.println("Map Size: " + map.size());
    }
}
