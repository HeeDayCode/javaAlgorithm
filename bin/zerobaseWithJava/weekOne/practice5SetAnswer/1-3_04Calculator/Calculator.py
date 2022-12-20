def solution(s):
    """
    :param s: str
    :return: int
    """

    nums = []
    ops = []
    save(s, nums, ops)

    return calc(nums, ops)


def save(s, nums, ops):
    i = 0
    tmpNum = ''
    while (i < len(s)):
        c = s[i]

        if isNumber(c):
            tmpNum += c
        else:
            if i == 0:
                nums.append(0)
                ops.append(c)
            else:
                nums.append(int(tmpNum))
                ops.append(c)

            tmpNum = ''

        i = i + 1

    nums.append(int(tmpNum))


def calc(nums, ops):
    if len(nums) == 1:
        return nums[0]

    num1 = nums.pop(0)
    num2 = nums.pop(0)

    calcNum = add(num1, num2) if ops.pop(0) == '+' else sub(num1, num2)
    nums.insert(0, calcNum)
    return calc(nums, ops)


def add(num1, num2):
    return num1 + num2


def sub(num1, num2):
    return num1 - num2


def isNumber(c):
    charCode = ord(c)
    return 48 <= charCode <= 57
