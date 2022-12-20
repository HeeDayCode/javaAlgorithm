import re


def solution(s):
    """
    :param s: str
    :return: str[]
    """

    tokens = re.split(r'[.,!? ]', s)
    removedEmptyTokens = filter(lambda word: word != '', tokens)
    reversedTokens = map(lambda word: word[::-1], removedEmptyTokens)
    return list(reversedTokens)
