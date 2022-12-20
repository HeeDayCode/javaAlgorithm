def solution(A):
    stock = [0 for _ in range(len(A))]
    stack = [0]

    for i in range(1, len(A)):
        for j in range (0, i):
            temp = A[i] - A[j]
            if temp > 0 and stock[j] < temp:
                stock[j] = temp

    return max(stock)
