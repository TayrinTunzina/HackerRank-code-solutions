# Input: Five positive integers
numbers = list(map(int, input("Enter five space-separated integers: ").split()))

# Calculate the total sum of all numbers
total_sum = sum(numbers)

# Minimum sum is obtained by excluding the maximum number
min_sum = total_sum - max(numbers)

# Maximum sum is obtained by excluding the minimum number
max_sum = total_sum - min(numbers)

# Print the result
print(min_sum, max_sum)