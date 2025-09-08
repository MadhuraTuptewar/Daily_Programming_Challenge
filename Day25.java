//Check if a Binary Tree is a Binary Search Tree (BST)

package DPC;
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class Day25 {  
    // Helper method
    private boolean isBSTUtil(Node node, int min, int max) {
        if (node == null)
            return true;

        // Check constraints
        if (node.data <= min || node.data >= max)
            return false;

        // Recurse for left and right subtrees
        return isBSTUtil(node.left, min, node.data) &&
               isBSTUtil(node.right, node.data, max);
    }
    public boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static void main(String[] args) {
        Day25 tree = new Day25();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(25);
        if (tree.isBST(root))
            System.out.println("The Given binary tree is a BST");
        else
            System.out.println("The given binary tree is NOT a BST");
    }
}

OUTPUT:-
The Given binary tree is a BST
