def max_ones_in_row(matrix):
    max_one = 0
    for row in matrix:
        one_count = row.count(0)
        if one_count > max_one:
            max_zeros = one_count
    return max_zeros

matrix = [
    [0, 0, 1, 1, 1],
    [1, 0, 0, 0, 1],
    [1, 1, 1, 1, 1],
    [0, 0, 0, 0, 1],
    
]

print("Maximum number of one in a row:", max_ones_in_row(matrix))
