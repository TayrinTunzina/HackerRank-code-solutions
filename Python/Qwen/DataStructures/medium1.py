class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def isBSTUtil(node, min_value, max_value):
    if node is None:
        return True
    if node.data < min_value or node.data > max_value:
        return False
    return (isBSTUtil(node.left, min_value, node.data - 1) and
            isBSTUtil(node.right, node.data + 1, max_value))

def isBST(root):
    return isBSTUtil(root, float('-inf'), float('inf'))

def buildTree():
    print("Enter the root node value:")
    root_val = int(input())
    root = Node(root_val)
    queue = [root]

    while queue:
        current = queue.pop(0)
        print(f"Enter left child of {current.data} (or -1 if no left child):")
        left_val = int(input())
        if left_val != -1:
            current.left = Node(left_val)
            queue.append(current.left)

        print(f"Enter right child of {current.data} (or -1 if no right child):")
        right_val = int(input())
        if right_val != -1:
            current.right = Node(right_val)
            queue.append(current.right)

    return root

if __name__ == "__main__":
    # Build the binary tree manually
    root = buildTree()

    # Check if the tree is a BST
    if isBST(root):
        print("Yes")
    else:
        print("No")