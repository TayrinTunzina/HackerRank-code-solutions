def miniMaxSum(arr):
    # Sort the array to easily find the minimum and maximum sums
    arr.sort()

    # Calculate the minimum sum by summing the first four elements
    min_sum = sum(arr[:4])

    # Calculate the maximum sum by summing the last four elements
    max_sum = sum(arr[1:])

    # Print the results as space-separated values
    print(min_sum, max_sum)

# Example usage:
arr = [1, 2, 3, 4, 5]
miniMaxSum(arr)
