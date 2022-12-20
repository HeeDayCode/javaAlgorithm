def solution(n):
    """
    :param n: number
    :return: boolean
    """

    for i in range(2, n):
        if n % i == 0:
            return False

    return True
