def solution(orders, n):
    """
    :param orders: int[]
    :param n: int
    :return: int
    """

    missCount = 0
    num = 0
    i = 0
    while missCount != n:
        num += 1

        if i < len(orders) and orders[i] == num:
            i += 1
        else:
            missCount += 1
    return num
