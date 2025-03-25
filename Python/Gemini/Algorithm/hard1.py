def morganAndString(a, b):
    result = ""
    i = 0
    j = 0
    while i < len(a) and j < len(b):
        if a[i] < b[j]:
            result += a[i]
            i += 1
        elif a[i] > b[j]:
            result += b[j]
            j += 1
        else:  # If letters are equal, choose the shorter string
            if len(a[i:]) < len(b[j:]):
                result += a[i]
                i += 1
            else:
                result += b[j]
                j += 1
    result += a[i:]  # Append remaining letters from a
    result += b[j:]  # Append remaining letters from b
    return result

if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        a = input()
        b = input()
        print(morganAndString(a, b))