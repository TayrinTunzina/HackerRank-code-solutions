def morganAndString(a, b):
    result = []
    i, j = 0, 0
    while i < len(a) and j < len(b):
        if a[i:] < b[j:]:
            result.append(a[i])
            i += 1
        else:
            result.append(b[j])
            j += 1
    # Append the remaining characters
    result.extend(a[i:])
    result.extend(b[j:])
    return ''.join(result)

# Input
t = int(input("Enter the number of test cases: "))
for _ in range(t):
    a = input("Enter Jack's letters: ")
    b = input("Enter Daniel's letters: ")
    # Output
    print(morganAndString(a, b))