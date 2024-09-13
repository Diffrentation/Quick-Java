public class _01Trees {
    public static class Node {
        int data;
        Node left;
        Node right;

        // Constructor to initialize the data and children of the node.
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;  // Increment the index to access the next element in the array
            if (idx >= nodes.length) {
                return null;
            }
            if (nodes[idx] == -1) {
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);  // Build the left subtree
            newNode.right = buildTree(nodes);  // Build the right subtree

            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, -1, 6, -1, 5, 7, -1, 4, -1, 9, 8};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        
        // Print the root node's data
        if (root != null) {
            System.out.println("Tree built successfully with root node: " + root.data);
        } else {
            System.out.println("Tree is empty.");
        }
    }
}
