def minMaxSum(arr):
    # Sort the array to make it easier to find min and max sums
    arr.sort()
    
    # Min sum is sum of first 4 numbers
    min_sum = sum(arr[:4])
    
    # Max sum is sum of last 4 numbers
    max_sum = sum(arr[1:])
    
    return min_sum, max_sum

# Example usage
arr = [1, 2, 3, 4, 5]
min_sum, max_sum = minMaxSum(arr)
print(min_sum, max_sum)  # Output: 16 24