def solution(n, s, t):
    '''
    :param n: number
    :param s: string
    :param t: number
    :return: string
    '''
    repeat_duration = n + len(s)

    optimize_time = t % repeat_duration

    text = ('.' * n) + s + ('.' * (n - 1))
    return text[optimize_time:optimize_time + n]
