import java.util.*;

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
        public static Node buildTree(int[] nodes, int[] idx) {
            idx[0]++;  // Increment the index to access the next element in the array
            if (idx[0] >= nodes.length || nodes[idx[0]] == -1) {   
                return null;
            }

            Node newNode = new Node(nodes[idx[0]]);
            newNode.left = buildTree(nodes, idx);  // Build the left subtree
            newNode.right = buildTree(nodes, idx);  // Build the right subtree

            return newNode;
        }
    }

    public static void preorder(Node root){
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void inorder(Node root){
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void postorder(Node root){
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void levelOrder(Node root) {
        if (root == null) return; // Edge case: empty tree
    
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // Marker for end of level
    
        while (!q.isEmpty()) {  
            Node currNode = q.remove();
    
            if (currNode == null) {  // End of current level
                System.out.println("");  // Print a newline
                if (q.isEmpty()) {    // If queue is empty, break the loop
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");  // Print current node's data
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // Function for counting the number of nodes
    public static int countNodes(Node root) {
        if (root == null) return 0;
        int leftNodes = countNodes(root.left); 
        int rightNodes = countNodes(root.right);
        return leftNodes + rightNodes + 1;  // Add 1 for the current node
    }
    public static int sumofNodes(Node root) {
        if(root==null) return 0;
        int leftNodeSum=sumofNodes(root.left);
        int rightNodeSum=sumofNodes(root.right);
        int totalSum=leftNodeSum+rightNodeSum+root.data;
        return totalSum;

    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftNode=height(root.left);
        int rightNode=height(root.right);
        int totalHeight=Math.max(leftNode,rightNode)+1;
        return totalHeight;
    }
    
    
    public static void main(String[] args) {
        int[] nodes = {1, 2, -1, 6, -1, 5, 7, -1, 4, -1, 9, 8};
        int[] idx = {-1}; 
        // Use an array to pass the index by reference
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes, idx);
        
        // Print the root node's data
        if (root != null) {
            System.out.println("Tree built successfully with root node: " + root.data);
        } else {
            System.out.println("Tree is empty.");
        }

        System.out.print("Preorder traversal: ");
        preorder(root);
        System.out.println("\n");

        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println("\n");

        System.out.print("Postorder traversal: ");
        postorder(root);
        System.out.println("\n");

        // System.out.println("Level order traversal: ");
        // levelOrder(root);
        
        System.out.println("Total number of nodes: " + countNodes(root));
        System.out.println("Total number of nodes: " + sumofNodes(root));
    }
}
