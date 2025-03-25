import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class CheckBST {

    public static boolean checkBST(Node root) {
        return checkBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean checkBSTHelper(Node node, long min, long max) {
        if (node == null) {
            return true;
        }

        if (node.data <= min || node.data >= max) {
            return false;
        }

        return checkBSTHelper(node.left, min, node.data) && checkBSTHelper(node.right, node.data, max);
    }

    public static Node insert(Node root, int data, Node parent, String direction) {
        if (root == null) {
            return new Node(data);
        }

        if (parent == null) { // Handle root node case
            return root;
        }

        if (direction.equals("L")) {
            parent.left = new Node(data);
        } else if (direction.equals("R")) {
            parent.right = new Node(data);
        }

        return root;
    }

    public static Node findNode(Node root, int data) { // Define findNode before insert
        if (root == null) {
            return null;
        }

        if (root.data == data) {
            return root;
        }

        Node leftResult = findNode(root.left, data);
        if (leftResult != null) {
            return leftResult;
        }

        return findNode(root.right, data);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        Node root = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the data for node " + (i + 1) + ": ");
            int data = scanner.nextInt();

            if (i == 0) {
                root = new Node(data);
            } else {
                System.out.print("Enter the parent node data for node " + (i + 1) + ": ");
                int parentData = scanner.nextInt();
                System.out.print("Enter direction (L for left, R for right): ");
                String direction = scanner.next();
                root = insert(root, data, findNode(root, parentData), direction);
            }
        }

        if (checkBST(root)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
