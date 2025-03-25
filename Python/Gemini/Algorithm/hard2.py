def max_substring_value(t):
    """
    Calculates the maximum value of f(s) for any substring s of t.

    Args:
        t: The input string.

    Returns:
        The maximum value of f(s).
    """
    n = len(t)
    max_value = 0
    freq = {}  # Dictionary to store substring frequencies

    for i in range(n):
        for j in range(i, n):
            sub = t[i:j+1]
            freq[sub] = freq.get(sub, 0) + 1
            max_value = max(max_value, len(sub) * freq[sub])

    return max_value

if __name__ == "__main__":
    t = input()
    print(max_substring_value(t))
