import unittest

from src.com.luckydave.algorithm.fastcampus.easy.MostClosestNumberToZero.MostClosestNumberToZero import solution


class CustomTestCase(unittest.TestCase):

    def test_1(self):
        # given
        arr = [5, 2, 1, 3]

        # when
        result = solution(arr)

        # then
        self.assertEqual(1, result)

    def test_2(self):
        # given
        arr = [7, 1, 7, 4, 6]

        # when
        result = solution(arr)

        # then
        self.assertEqual(1, result)

    def test_3(self):
        # given
        arr = [4, 2, 2]

        # when
        result = solution(arr)

        # then
        self.assertEqual(2, result)

    def test_4(self):
        # given
        arr = [0]

        # when
        result = solution(arr)

        # then
        self.assertEqual(0, result)

    def test_5(self):
        # given
        arr = [100]

        # when
        result = solution(arr)

        # then
        self.assertEqual(100, result)

    def test_6(self):
        # given
        arr = [18, 78, 75, 63, 19, 91, 71, 13, 86, 67]

        # when
        result = solution(arr)

        # then
        self.assertEqual(13, result)


if __name__ == '__main__':
    unittest.main()
