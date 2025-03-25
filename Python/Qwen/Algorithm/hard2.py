def max_f_value(t):
    n = len(t)
    max_value = 0

    # Dictionary to store the frequency of substrings
    freq_map = {}

    # Sliding window to generate all substrings
    for i in range(n):
        current_hash = 0
        power = 1  # To handle powers of the base in rolling hash
        base = 31  # Prime number for hashing
        mod = 10**9 + 7  # Large prime for modulo to avoid overflow

        for j in range(i, n):
            # Update the rolling hash
            current_hash = (current_hash * base + (ord(t[j]) - ord('a') + 1)) % mod

            # Update the frequency map
            substring = t[i:j+1]
            if substring not in freq_map:
                freq_map[substring] = 0
            freq_map[substring] += 1

            # Calculate f(s) for the current substring
            f_s = len(substring) * freq_map[substring]
            max_value = max(max_value, f_s)

    return max_value


# Input and Output
if __name__ == "__main__":
    t = input().strip()
    print(max_f_value(t))