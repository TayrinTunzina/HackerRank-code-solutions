def max_f_value(t):
    from collections import defaultdict

    max_value = 0
    n = len(t)

    # Iterate over all possible substring lengths
    for length in range(1, min(n + 1, 100)):  # Limit length to avoid timeouts
        freq = defaultdict(int)
        # Use a sliding window to count occurrences of substrings of current length
        for i in range(n - length + 1):
            substring = t[i:i + length]
            freq[substring] += 1
        # Calculate f(s) for each substring of current length
        for substring, count in freq.items():
            current_value = length * count
            if current_value > max_value:
                max_value = current_value

    return max_value

# Manually take input
t = input("Enter the string t: ").strip()

# Output
print("Maximum value of f(s):", max_f_value(t))