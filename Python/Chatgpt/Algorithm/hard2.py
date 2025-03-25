from collections import defaultdict

def max_f_value(t):
    n = len(t)
    max_f = 0
    
    # Iterate through all possible lengths of substrings
    for length in range(1, n + 1):
        substring_count = defaultdict(int)
        
        # Use a sliding window of size `length` to count occurrences
        for i in range(n - length + 1):
            substring = t[i:i + length]
            substring_count[substring] += 1
        
        # Calculate f(s) for all substrings of this length
        for substring, count in substring_count.items():
            max_f = max(max_f, length * count)
    
    return max_f

if __name__ == "__main__":
    t = input().strip()
    print(max_f_value(t))
