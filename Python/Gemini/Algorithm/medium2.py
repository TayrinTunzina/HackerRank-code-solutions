def flippingMatrix(matrix):
    n = len(matrix) // 2
    max_sum = 0

    for i in range(n):
        for j in range(n):
            max_sum += max(
                matrix[i][j], 
                matrix[i][2*n - j - 1], 
                matrix[2*n - i - 1][j], 
                matrix[2*n - i - 1][2*n - j - 1]
            )
    
    return max_sum

if __name__ == "__main__":
    q = int(input("Enter the number of queries: "))

    for _ in range(q):
        n = int(input("Enter the size of the matrix (n): "))
        matrix = []
        print("Enter the matrix elements row-wise:")
        for _ in range(2 * n):
            matrix.append(list(map(int, input().split())))

        result = flippingMatrix(matrix)
        print("Maximum sum:", result)
