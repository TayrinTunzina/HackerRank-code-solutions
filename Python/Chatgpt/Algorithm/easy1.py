def miniMaxSum(arr):
    # Sort the array to easily find the minimum and maximum sums
    arr.sort()

    # Calculate the minimum sum by summing the first four elements
    min_sum = sum(arr[:4])

    # Calculate the maximum sum by summing the last four elements
    max_sum = sum(arr[1:])

    # Print the results as space-separated values
    print(min_sum, max_sum)

# Take input manually from the user
# Expecting space-separated integers
arr = list(map(int, input("Enter 5 integers separated by space: ").split()))

# Check if the user entered exactly 5 integers
if len(arr) != 5:
    print("Please enter exactly 5 integers.")
else:
    miniMaxSum(arr)
