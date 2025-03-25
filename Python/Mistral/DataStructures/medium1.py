class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def is_bst(root, min_val=float('-inf'), max_val=float('inf')):
    if root is None:
        return True
    if not (min_val < root.data < max_val):
        return False
    return is_bst(root.left, min_val, root.data) and is_bst(root.right, root.data, max_val)

def build_tree():
    root = TreeNode(int(input("Enter root value: ")))
    queue = [root]
    while queue:
        current = queue.pop(0)
        left_data = input(f"Enter left child of {current.data} (or 'none' if none): ")
        if left_data.lower() != 'none':
            current.left = TreeNode(int(left_data))
            queue.append(current.left)
        right_data = input(f"Enter right child of {current.data} (or 'none' if none): ")
        if right_data.lower() != 'none':
            current.right = TreeNode(int(right_data))
            queue.append(current.right)
    return root

# Example usage:
root = build_tree()
result = is_bst(root)
print("Is BST: Yes" if result else "Is BST: No")