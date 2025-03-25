def mini_max_sum(arr):
  """Calculates the minimum and maximum sum of four out of five numbers.

  Args:
    arr: A list of five positive integers.

  Returns:
    None. Prints the minimum and maximum sum to the console.
  """

  # Sort the array in ascending order
  arr.sort()

  # Calculate the minimum sum (sum of the first four elements)
  min_sum = sum(arr[:4])

  # Calculate the maximum sum (sum of the last four elements)
  max_sum = sum(arr[1:])

  print(min_sum, max_sum)

# Example usage:
numbers = [1, 2, 3, 4, 5]
mini_max_sum(numbers)  # Output: 10 14
