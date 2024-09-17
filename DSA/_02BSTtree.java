public class _02BSTtree {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node Insert(Node root, int value) {
        if (root == null) {
            root = new Node(value); // Corrected this line
            return root;
        } else {
            if (root.data > value) {
                root.left = Insert(root.left, value);
            }
            if (root.data < value) {
                root.right = Insert(root.right, value);
            }
        }
        return root; // Added this line to return the root
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        } else {
            inorder(root.left);
            System.out.print(root.data+","); // Corrected this line to print root.data
            inorder(root.right);
        }
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        else if(root.data==key){
            return true;
        }
        else if(root.data>key){
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = {1, 3, 4, 6, 5, 2, 8, 7, 9};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        inorder(root);
        if(search(root, 8)){
            System.out.println(" Fount");
        }
        else{
            System.out.println("Not fount");
        }
    }
}
