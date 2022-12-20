def solution(n):
    """
    :param n: number
    :return: number
    """

    result = 0

    for i in range(1, n + 1):
        if n < i * i: break

        if n == i * i:
            result = i
            break

    return result