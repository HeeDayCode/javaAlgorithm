def solution(s):
    """
    :param s: str
    :return: str
    """

    stack = []
    for c in s:
        if len(stack) > 0 and stack[-1] == c:
            stack.pop()
        else:
            stack.append(c)

    result = ''
    for c in stack:
        result += c

    return result
