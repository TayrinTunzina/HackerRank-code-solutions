class Node:
    def __init__(self, data):
        self.right = self.left = None
        self.data = data

def check_bst(root):
    def helper(node, min_val, max_val):
        if not node:
            return True
        if not (min_val < node.data < max_val):
            return False
        return helper(node.left, min_val, node.data) and helper(node.right, node.data, max_val)
    return helper(root, float('-inf'), float('inf')) 

def insert(root, data, parent=None, direction=None):  # Optional parent and direction arguments
    if root is None:
        return Node(data)
    if parent is None:  # Handle root node case
        return root
    if direction == "L":
        parent.left = Node(data)
    elif direction == "R":
        parent.right = Node(data)
    return root

def findNode(root, data):  # Define findNode before it's used
    if root is None:
        return None
    if root.data == data:
        return root
    leftResult = findNode(root.left, data)
    if leftResult:
        return leftResult
    return findNode(root.right, data)

T = int(input("Enter the number of nodes: "))
root = None

for i in range(T):
    data = int(input("Enter the data for node {}: ".format(i + 1)))
    if i == 0:
        root = Node(data)
    else:
        parent_data = int(input("Enter the parent node data for node {}: ".format(i + 1)))
        direction = input("Enter direction (L for left, R for right): ")
        root = insert(root, data, findNode(root, parent_data), direction)

if check_bst(root):
    print("Yes")
else:
    print("No")
