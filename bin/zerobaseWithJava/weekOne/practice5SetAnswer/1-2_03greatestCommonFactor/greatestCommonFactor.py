def GCD(a, b):
    if b == 0: return a
    else: return GCD(b, a%b)

def solution(A):
    A.sort(reverse=True)

    retVal = GCD(A[0], A[1])


    for i in range(2, len(A)):
        retVal = GCD(retVal, A[i])

    return retVal
