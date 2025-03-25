# Function to find the minimum and maximum sums of four out of five integers
def find_min_max_sums(arr):
    arr.sort()
    min_sum = sum(arr[:4])
    max_sum = sum(arr[1:])
    return min_sum, max_sum

# Manually input the five integers
arr = list(map(int, input("Enter five space-separated integers: ").split()))

# Find the minimum and maximum sums
min_sum, max_sum = find_min_max_sums(arr)

# Print the results
print(min_sum, max_sum)
