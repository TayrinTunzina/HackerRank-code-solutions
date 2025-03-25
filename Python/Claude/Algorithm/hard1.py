def morganAndString(a, b):
    a = a + 'z'  # Add sentinel characters
    b = b + 'z'
    result = []
    i = j = 0
    
    while i < len(a)-1 or j < len(b)-1:
        if a[i:] <= b[j:]:
            result.append(a[i])
            i += 1
        else:
            result.append(b[j])
            j += 1
    
    return ''.join(result)

def main():
    t = int(input())
    for _ in range(t):
        a = input().strip()
        b = input().strip()
        print(morganAndString(a, b))

if __name__ == "__main__":
    main()