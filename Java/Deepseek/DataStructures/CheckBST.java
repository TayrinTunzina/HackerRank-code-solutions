import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class CheckBST {
    public boolean isBST(TreeNode root) {
        return inOrderTraversal(root, new int[]{Integer.MIN_VALUE});
    }

    private boolean inOrderTraversal(TreeNode node, int[] prev) {
        if (node == null) return true;
        if (!inOrderTraversal(node.left, prev)) return false;
        if (prev[0] != Integer.MIN_VALUE && node.val <= prev[0]) return false;
        prev[0] = node.val;
        return inOrderTraversal(node.right, prev);
    }

    // Helper method to build the tree from user input
    public TreeNode buildTree(Scanner scanner) {
        System.out.print("Enter the value for the current node (or -1 to skip): ");
        int val = scanner.nextInt();
        if (val == -1) {
            return null;
        }
        TreeNode node = new TreeNode(val);
        System.out.println("Enter left child of " + val + ":");
        node.left = buildTree(scanner);
        System.out.println("Enter right child of " + val + ":");
        node.right = buildTree(scanner);
        return node;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckBST solution = new CheckBST();

        System.out.println("Build the binary tree:");
        TreeNode root = solution.buildTree(scanner);

        // Convert boolean result to "yes" or "no"
        boolean isBST = solution.isBST(root);
        String result = isBST ? "yes" : "no";
        System.out.println("Is the tree a valid BST? " + result);

        scanner.close();
    }
}