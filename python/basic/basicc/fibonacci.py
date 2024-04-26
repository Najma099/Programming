def multiply_matrices(A, B):
    if(len(A)!=len(B[0])):
        return None
    else:
        result = [[0]*len(B[0]) for i in range(len(A))]
        for i in range(len(A)):
            for j in range(len(B[0])):
                for k in range(len(A[0])):
                    result[i][j] += A[i][k] * B[k][j]
        return result

def power_matrix(M, n):
    
    if n==0:
        return [[1,0],[0,1]]
    if n == 1:
        return M
    elif n % 2 == 0:
        half_power = power_matrix(M, n // 2)
        return multiply_matrices(half_power, half_power)
    else:
        return multiply_matrices(M, power_matrix(M, n - 1))

def fibonacci_with_matrix(n, M):
    
    if n == 0:
        return 0
    elif n == 1:
        return 1
    

    M_pow_n_minus_1 = power_matrix(M, n - 1)

    
    F_n = M_pow_n_minus_1[0][0]

    return F_n

