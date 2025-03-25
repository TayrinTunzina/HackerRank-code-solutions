def morganAndString(a, b):
    result = []
    i, j = 0, 0
    n, m = len(a), len(b)
    
    while i < n and j < m:
        if a[i:] < b[j:]:
            result.append(a[i])
            i += 1
        else:
            result.append(b[j])
            j += 1
    
    # Append remaining characters from either string
    result.append(a[i:])
    result.append(b[j:])
    
    return ''.join(result)

# Manual input
if __name__ == "__main__":
    t = int(input("Enter number of test cases: "))
    results = []
    for _ in range(t):
        a = input("Enter Jack's collection: ")
        b = input("Enter Daniel's collection: ")
        results.append(morganAndString(a, b))
    
    print("\nResults:")
    for res in results:
        print(res)