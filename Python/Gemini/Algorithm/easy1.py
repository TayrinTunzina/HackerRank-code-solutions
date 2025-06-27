def mini_max_sum():
  """Calculates the minimum and maximum sum of four out of five numbers
  from user input.

  Args:
    None.

  Returns:
    None. Prints the minimum and maximum sum to the console.
  """
  print("Enter five positive integers, separated by spaces:")
  
  # Take user input and convert it to a list of integers
  try:
    arr = list(map(int, input().split()))
    
    # Check if the input has exactly 5 numbers
    if len(arr) != 5:
      print("Error: Please enter exactly five numbers.")
      return

    # Check if all numbers are positive
    if any(num <= 0 for num in arr):
      print("Error: Please enter only positive integers.")
      return
      
  except ValueError:
    print("Error: Invalid input. Please enter integers only.")
    return

  # Sort the array in ascending order
  arr.sort()

  # Calculate the minimum sum (sum of the first four elements)
  min_sum = sum(arr[:4])

  # Calculate the maximum sum (sum of the last four elements)
  max_sum = sum(arr[1:])

  print(f"The minimum sum is: {min_sum}")
  print(f"The maximum sum is: {max_sum}")
  print(f"Result: {min_sum} {max_sum}")

# Call the function to run the program
mini_max_sum()
