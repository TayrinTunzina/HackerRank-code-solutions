def mini_max_sum(arr):
    arr.sort()
    min_sum = sum(arr[:4])
    max_sum = sum(arr[-4:])
    print(min_sum, max_sum)

# Taking input from the user
arr = list(map(int, input("Enter five positive integers separated by space: ").split()))
if len(arr) == 5:
    mini_max_sum(arr)
else:
    print("Please enter exactly five positive integers.")
