import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class CheckBST {
    static boolean isBSTUtil(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) return false;
        return isBSTUtil(root.left, min, root.data) && isBSTUtil(root.right, root.data, max);
    }

    static boolean checkBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static Node buildTreeFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = scanner.nextInt();
        Map<Integer, Node> nodes = new HashMap<>();
        System.out.println("Enter the nodes in format 'parent child direction' (direction: L or R):");
        for (int i = 0; i < n - 1; i++) {
            int parent = scanner.nextInt();
            int child = scanner.nextInt();
            char direction = scanner.next().charAt(0);
            nodes.putIfAbsent(parent, new Node(parent));
            nodes.putIfAbsent(child, new Node(child));
            if (direction == 'L') {
                nodes.get(parent).left = nodes.get(child);
            } else if (direction == 'R') {
                nodes.get(parent).right = nodes.get(child);
            }
        }
        System.out.println("Enter the root node:");
        int root = scanner.nextInt();
        return nodes.get(root);
    }

    public static void main(String[] args) {
        Node root = buildTreeFromInput();
        System.out.println(checkBST(root) ? "Yes" : "No");
    }
}
