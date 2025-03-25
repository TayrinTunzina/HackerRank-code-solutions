import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class CheckBST {

    public static boolean isBST(TreeNode node, int minVal, int maxVal) {
        if (node == null) {
            return true;
        }
        if (!(minVal < node.data && node.data < maxVal)) {
            return false;
        }
        return isBST(node.left, minVal, node.data) && isBST(node.right, node.data, maxVal);
    }

    public static TreeNode buildTree(Scanner scanner) {
        System.out.print("Enter root value: ");
        int rootValue = scanner.nextInt();
        TreeNode root = new TreeNode(rootValue);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            System.out.print("Enter left child of " + current.data + " (or 'none' if none): ");
            String leftInput = scanner.next();
            if (!leftInput.equalsIgnoreCase("none")) {
                int leftData = Integer.parseInt(leftInput);
                current.left = new TreeNode(leftData);
                queue.add(current.left);
            }

            System.out.print("Enter right child of " + current.data + " (or 'none' if none): ");
            String rightInput = scanner.next();
            if (!rightInput.equalsIgnoreCase("none")) {
                int rightData = Integer.parseInt(rightInput);
                current.right = new TreeNode(rightData);
                queue.add(current.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = buildTree(scanner);
        boolean result = isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("Is BST: " + (result ? "Yes" : "No"));
        scanner.close();
    }
}
