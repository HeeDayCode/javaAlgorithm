import math
from random import random


def solution(s):
    """
    :param s: str
    :return: int
    """

    numsCount = [0] * 10

    for i in range(len(s)):
        c = s[i]
        num = int(c)

        numsCount[num] += 1

    return mostAppearNum(numsCount)


def mostAppearNum(numsCount):
    result = -1
    cnt = 0

    for i in range(10):
        if cnt < numsCount[i]:
            result = i
            cnt = numsCount[i]

    return result
