import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class CheckBST {
    Node root;

    boolean isBST(Node node, int left, int right) {
        if (node == null)
            return true;
        if (node.data <= left || node.data >= right)
            return false;
        return (isBST(node.left, left, node.data) && 
                isBST(node.right, node.data, right));
    }

    Node insert(Node node, int parent, int child, char direction) {
        if (node == null) {
            node = new Node(parent);
        }
        if (node.data == parent) {
            if (direction == 'L')
                node.left = new Node(child);
            else if (direction == 'R')
                node.right = new Node(child);
        } else {
            if (node.left != null)
                insert(node.left, parent, child, direction);
            if (node.right != null)
                insert(node.right, parent, child, direction);
        }
        return node;
    }

    public static void main(String args[]) {
        CheckBST tree = new CheckBST();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter root node value: ");
        int rootValue = scanner.nextInt();
        tree.root = new Node(rootValue);
        System.out.println("Enter number of edges: ");
        int edges = scanner.nextInt();
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter edge (parent child direction): ");
            int parent = scanner.nextInt();
            int child = scanner.nextInt();
            char direction = scanner.next().charAt(0);
            tree.root = tree.insert(tree.root, parent, child, direction);
        }
        if (tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("Yes");
        else
            System.out.println("No");
        scanner.close();
    }
}
