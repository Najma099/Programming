def find_first_zero_row(matrix):
    row = len(matrix)
    cols = len(matrix[0])

    i, j = 0, cols - 1
    while i < row and j >= 0:
        while matrix[i][j]:
            j -= 1
            if j < 0:
                break
        i += 1
    
    return i

# Example usage:
matrix = [
    [0, 0, 0, 1, 1],
    [1, 0, 0, 0, 1],
    [1, 1, 1, 1, 1],
    [0, 0, 0, 0, 1],
    [0, 1, 1, 1, 1]
]

print(find_first_zero_row(matrix))
