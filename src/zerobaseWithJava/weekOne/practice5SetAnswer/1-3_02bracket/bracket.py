def solution(S):
    stack = []
    dict = {')' : '(',
            '}' : '{',
            ']' : '[',
            '>' : '<'
            }
    for s in S:
        if s in '({[<':
            stack.append(s)
        elif s in ')}]>':
            if len(stack) > 0:
                top = stack.pop()
                if dict[s] != top:
                    return 0
            else:
                return 0
    if len(stack) == 0:
        return 1
    else:
        return 0
