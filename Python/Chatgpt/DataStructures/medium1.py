class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


def isBSTUtil(root, min_value, max_value):
    if root is None:
        return True

    if root.data <= min_value or root.data >= max_value:
        return False

    return (isBSTUtil(root.left, min_value, root.data) and
            isBSTUtil(root.right, root.data, max_value))

def checkBST(root):
    return isBSTUtil(root, float('-inf'), float('inf'))

def build_tree_from_input():
    print("Enter the number of nodes:")
    n = int(input())
    nodes = {}
    print("Enter the nodes in format 'parent child direction' (direction: L or R):")
    for _ in range(n - 1):
        parent, child, direction = input().split()
        parent = int(parent)
        child = int(child)
        if parent not in nodes:
            nodes[parent] = Node(parent)
        if child not in nodes:
            nodes[child] = Node(child)
        if direction == 'L':
            nodes[parent].left = nodes[child]
        elif direction == 'R':
            nodes[parent].right = nodes[child]

    return nodes[int(input("Enter the root node: "))]

if __name__ == "__main__":
    root = build_tree_from_input()
    result = checkBST(root)
    print("Yes" if result else "No")
