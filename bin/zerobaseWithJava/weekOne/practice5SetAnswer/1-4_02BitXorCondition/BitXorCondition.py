from functools import reduce


def solution(arr):
    """
    :param arr: string[]
    :return: int
    """

    if len(arr) == 0:
        return 0

    arr = map(lambda c: int(c, 2), arr)
    return reduce(lambda pre, cur: pre ^ cur, arr)
