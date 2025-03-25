def morganAndString(a, b):
    result = []
    i = j = 0

    while i < len(a) and j < len(b):
        if a[i:] < b[j:]:
            result.append(a[i])
            i += 1
        elif a[i:] > b[j:]:
            result.append(b[j])
            j += 1
        else:
            k = 0
            while i + k < len(a) and j + k < len(b) and a[i + k] == b[j + k]:
                k += 1
            if i + k == len(a):
                result.append(b[j])
                j += 1
            elif j + k == len(b):
                result.append(a[i])
                i += 1
            else:
                if a[i + k] < b[j + k]:
                    result.append(a[i])
                    i += 1
                else:
                    result.append(b[j])
                    j += 1

    result.extend(a[i:])
    result.extend(b[j:])

    return ''.join(result)

# Read input manually
t = int(input("Enter the number of test cases: "))
results = []
for _ in range(t):
    a = input("Enter string a: ").strip()
    b = input("Enter string b: ").strip()
    results.append(morganAndString(a, b))

# Print results
for result in results:
    print(result)
