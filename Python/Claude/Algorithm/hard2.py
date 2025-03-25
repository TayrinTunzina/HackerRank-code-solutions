def calculate_f(s, t):
    count = 0
    length = len(s)
    for i in range(len(t) - len(s) + 1):
        if t[i:i+len(s)] == s:
            count += 1
    return length * count

def stringFunction(t):
    n = len(t)
    max_value = 0
    
    # Generate all possible substrings
    for length in range(1, n + 1):
        # Use set to avoid duplicate substrings
        substrings = set()
        for i in range(n - length + 1):
            substrings.add(t[i:i+length])
        
        # Calculate f(s) for each unique substring
        for s in substrings:
            value = calculate_f(s, t)
            max_value = max(max_value, value)
    
    return max_value

# Manual input handling
def main():
    t = input().strip()
    print(stringFunction(t))

if __name__ == "__main__":
    main()