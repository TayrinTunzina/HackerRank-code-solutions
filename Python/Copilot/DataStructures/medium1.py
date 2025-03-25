class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def is_bst(node, left=float('-inf'), right=float('inf')):
    if not node:
        return True
    if not (left < node.data < right):
        return False
    return (is_bst(node.left, left, node.data) and 
            is_bst(node.right, node.data, right))

def insert(root, parent, child, direction):
    if root is None:
        return Node(parent)
    if root.data == parent:
        if direction == 'L':
            root.left = Node(child)
        elif direction == 'R':
            root.right = Node(child)
    else:
        if root.left:
            insert(root.left, parent, child, direction)
        if root.right:
            insert(root.right, parent, child, direction)
    return root

def main():
    root_value = int(input("Enter root node value: "))
    root = Node(root_value)
    edges = int(input("Enter number of edges: "))
    for _ in range(edges):
        parent, child, direction = input("Enter edge (parent child direction): ").split()
        parent, child = int(parent), int(child)
        root = insert(root, parent, child, direction)
    
    if is_bst(root):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
