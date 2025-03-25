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
    result.extend(a[i:])
    result.extend(b[j:])
    return ''.join(result)

# Input and output handling
T = int(input("Enter the number of test cases: "))
for _ in range(T):
    a = input("Enter Jack's letters: ")
    b = input("Enter Daniel's letters: ")
    print(morganAndString(a, b))
