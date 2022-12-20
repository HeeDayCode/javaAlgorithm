def solution(S):
    s = S.lstrip("0")
    n = 0
    if len(s) != 0:
        n = 1 #ignore first 1
        ss = s[1:]
        one = ss.count("1")
        zero = ss.count("0")

        n += (one * 2)
        n += zero

    return n
