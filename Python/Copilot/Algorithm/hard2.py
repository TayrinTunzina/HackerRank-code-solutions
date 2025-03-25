from collections import defaultdict

def max_value(t):
    n = len(t)
    count = defaultdict(int)

    for i in range(n):
        for j in range(i, n):
            s = t[i:j+1]
            count[s] += 1

    max_f = 0
    for s in count:
        f_s = len(s) * count[s]
        max_f = max(max_f, f_s)

    return max_f

# Manual Input
t = input("Enter the string: ")
print(max_value(t))
