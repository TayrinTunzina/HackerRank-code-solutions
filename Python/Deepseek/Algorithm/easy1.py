def miniMaxSum(arr):
    total_sum = sum(arr)
    min_val = min(arr)
    max_val = max(arr)
    
    # Minimum sum is total_sum - max_val
    # Maximum sum is total_sum - min_val
    min_sum = total_sum - max_val
    max_sum = total_sum - min_val
    
    print(min_sum, max_sum)

# Input
arr = list(map(int, input("Enter five positive integers: ").split()))
miniMaxSum(arr)