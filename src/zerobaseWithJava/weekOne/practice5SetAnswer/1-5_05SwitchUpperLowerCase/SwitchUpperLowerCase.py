def solution(s):
    """
    :param s: string
    :return: string
    """

    result = ''
    for c in s:
        result += switch_upper_lower_case(c)

    return result


def switch_upper_lower_case(c):
    return c.lower() if (c == c.upper()) else c.upper()
