def minMaxSum(arr):
    # Sort the array to make it easier to find min and max sums
    arr.sort()
    
    # Min sum is sum of first 4 numbers
    min_sum = sum(arr[:4])
    
    # Max sum is sum of last 4 numbers  
    max_sum = sum(arr[1:])
    
    return min_sum, max_sum

# Get input from user
print("Enter 5 integers separated by spaces:")
user_input = input()

# Convert input to list of integers
try:
    arr = list(map(int, user_input.split()))
    
    # Check if exactly 5 numbers were entered
    if len(arr) != 5:
        print("Please enter exactly 5 integers.")
    else:
        min_sum, max_sum = minMaxSum(arr)
        print(f"Min sum: {min_sum}, Max sum: {max_sum}")
        
except ValueError:
    print("Please enter valid integers only.")
