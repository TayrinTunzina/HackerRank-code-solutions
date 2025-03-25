import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class CheckBST {
    // Utility method to check if the tree is a BST
    public static boolean isBSTUtil(TreeNode node, int min_value, int max_value) {
        if (node == null)
            return true;

        // Check if the current node's value violates the min/max constraint
        if (node.data <= min_value || node.data >= max_value)
            return false;

        // Recursively check the left and right subtrees
        return (isBSTUtil(node.left, min_value, node.data) &&
                isBSTUtil(node.right, node.data, max_value));
    }

    public static boolean isBST(TreeNode root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Method to build the tree using level-order input
    public static TreeNode buildTree(Scanner scanner) {
        System.out.println("Enter the tree in level-order format (use -1 for null nodes):");
        String[] tokens = scanner.nextLine().split("\\s+");

        if (tokens.length == 0 || tokens[0].equals("-1")) {
            return null;
        }

        int rootValue = Integer.parseInt(tokens[0]);
        TreeNode root = new TreeNode(rootValue);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty() && index < tokens.length) {
            TreeNode current = queue.poll();

            // Read left child
            if (!tokens[index].equals("-1")) {
                current.left = new TreeNode(Integer.parseInt(tokens[index]));
                queue.offer(current.left);
            }
            index++;

            // Read right child
            if (index < tokens.length && !tokens[index].equals("-1")) {
                current.right = new TreeNode(Integer.parseInt(tokens[index]));
                queue.offer(current.right);
            }
            index++;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Build the tree from user input
        TreeNode root = buildTree(scanner);

        // Check if the tree is a BST
        System.out.println(isBST(root) ? "Yes" : "No");

        scanner.close();
    }
}