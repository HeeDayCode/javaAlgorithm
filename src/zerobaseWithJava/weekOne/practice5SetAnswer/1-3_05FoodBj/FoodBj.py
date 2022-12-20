def solution(bj, one, two):
    """
    :param bj: str[]
    :param one: str[]
    :param two: str[]
    :return: str
    """

    reward = 150
    prize = (len(one) * reward) + (len(two) * (reward * 2)) + (reward * 3)
    winner = list(filter(lambda eachBj: eachBj not in (one + two), bj))
    return f'{prize}만원({winner[0]})'