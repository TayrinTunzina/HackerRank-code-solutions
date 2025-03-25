import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class CheckBST {
    static boolean isBSTUtil(Node node, int minValue, int maxValue) {
        if (node == null)
            return true;
            
        if (node.data <= minValue || node.data >= maxValue)
            return false;
            
        return isBSTUtil(node.left, minValue, node.data) &&
               isBSTUtil(node.right, node.data, maxValue);
    }
    
    static boolean checkBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    // Manual input handling
    static Node buildTree(Scanner scanner) {
        System.out.println("Enter value (-1 for null):");
        int data = scanner.nextInt();
        
        if (data == -1)  // Use -1 to indicate null node
            return null;
            
        Node node = new Node(data);
        System.out.println("Enter left child of " + data + " (-1 for null):");
        node.left = buildTree(scanner);
        System.out.println("Enter right child of " + data + " (-1 for null):");
        node.right = buildTree(scanner);
        return node;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter root value (-1 for null):");
        Node root = buildTree(scanner);
        System.out.println(checkBST(root) ? "Yes" : "No");
        scanner.close();
    }
}