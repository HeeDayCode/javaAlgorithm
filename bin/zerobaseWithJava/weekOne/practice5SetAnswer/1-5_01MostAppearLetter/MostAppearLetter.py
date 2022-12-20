def solution(s):
    """
    :param s: string
    :return: string
    """

    char_counter = {}
    for i in s:
        if i in char_counter:
            char_counter[i] += 1
        else:
            char_counter[i] = 1

    most_appear_char = None
    appear_count = 0
    for num, count in sorted(char_counter.items()):
        if appear_count < count:
            most_appear_char = num
            appear_count = count

    return most_appear_char
