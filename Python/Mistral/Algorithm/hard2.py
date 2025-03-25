def max_f_value(t):
    n = len(t)
    max_value = 0

    # Dictionary to store the count of each substring
    substring_count = {}

    # Generate all substrings and count their occurrences
    for i in range(n):
        for j in range(i, n):
            substring = t[i:j+1]
            if substring in substring_count:
                substring_count[substring] += 1
            else:
                substring_count[substring] = 1

    # Calculate the maximum value of f(s)
    for substring, count in substring_count.items():
        max_value = max(max_value, len(substring) * count)

    return max_value

# Take input manually
t = input("Enter the string t: ")
print(max_f_value(t))
