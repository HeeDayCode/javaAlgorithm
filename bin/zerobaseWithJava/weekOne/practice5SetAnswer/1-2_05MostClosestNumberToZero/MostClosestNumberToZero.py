def solution(arr):
    """
    :param arr: int[]
    :return: int
    """

    result = None
    for num in arr:
        if (result == None or num < result):
            result = num

    return result
