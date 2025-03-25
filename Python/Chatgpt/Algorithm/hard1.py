def morganAndString(a, b):
    a += 'Z'  # Sentinel character
    b += 'Z'  
    i, j = 0, 0
    result = []

    while i < len(a) - 1 or j < len(b) - 1:
        if a[i:] <= b[j:]:
            result.append(a[i])
            i += 1
        else:
            result.append(b[j])
            j += 1

    return ''.join(result)

# Read input
t = int(input())
for _ in range(t):
    a = input().strip()
    b = input().strip()
    print(morganAndString(a, b))
