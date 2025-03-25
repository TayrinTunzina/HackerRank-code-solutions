class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def checkBST(root):
    def isBSTUtil(node, min_val, max_val):
        if node is None:
            return True
            
        if node.data <= min_val or node.data >= max_val:
            return False
            
        return isBSTUtil(node.left, min_val, node.data) and \
               isBSTUtil(node.right, node.data, max_val)
               
    return isBSTUtil(root, float('-inf'), float('inf'))

def insert_level_order(arr, root, i, n):
    if i < n:
        if arr[i] is not None:
            temp = Node(arr[i])
            root = temp
            
            # Insert left child
            root.left = insert_level_order(arr, root.left, 2 * i + 1, n)
            
            # Insert right child
            root.right = insert_level_order(arr, root.right, 2 * i + 2, n)
    return root

# Main program with manual input
if __name__ == "__main__":
    
    print("Enter the nodes in level order (use -1 for null/None):")
    arr = list(map(int, input().split()))
    
    # Convert -1 to None
    arr = [None if x == -1 else x for x in arr]
    
    root = None
    root = insert_level_order(arr, root, 0, len(arr))
    
    result = checkBST(root)
    print("Yes" if result else "No")