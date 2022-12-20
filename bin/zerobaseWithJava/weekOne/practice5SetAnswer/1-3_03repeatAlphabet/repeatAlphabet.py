def repeatRemove(S):
    if S == "":
        return ""
    else:
        return re.sub('(([a-zA-Z])\\2{1,})', '', S)


def solution(S):
    retStr = None

    while True:
        retStr = repeatRemove(S)
        if retStr == S or retStr == "":
            break
        else:
            S = retStr

    if retStr == "":
        return 1
    else:
        return 0