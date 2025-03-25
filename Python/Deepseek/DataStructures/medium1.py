from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def isBSTUtil(node, minVal, maxVal):
    if node is None:
        return True
    if node.val <= minVal or node.val >= maxVal:
        return False
    return (isBSTUtil(node.left, minVal, node.val) and
            isBSTUtil(node.right, node.val, maxVal))

def isBST(root):
    return isBSTUtil(root, float('-inf'), float('inf'))

def buildTree():
    print("Enter the binary tree nodes in level order (use 'null' for missing nodes):")
    nodes = input().strip().split()
    if not nodes or nodes[0] == 'null':
        return None
    root = TreeNode(int(nodes[0]))
    q = deque([root])
    idx = 1
    while q and idx < len(nodes):
        current = q.popleft()
        if idx < len(nodes) and nodes[idx] != 'null':
            current.left = TreeNode(int(nodes[idx]))
            q.append(current.left)
        idx += 1
        if idx < len(nodes) and nodes[idx] != 'null':
            current.right = TreeNode(int(nodes[idx]))
            q.append(current.right)
        idx += 1
    return root

if __name__ == "__main__":
    root = buildTree()
    if isBST(root):
        print("Yes")
    else:
        print("No")