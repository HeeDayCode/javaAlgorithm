import unittest

from src.com.luckydave.algorithm.fastcampus.supereasy.SquareRoot.SquareRoot import solution


class CustomTestCase(unittest.TestCase):

    def test_1(self):
        # given
        n = 4

        # when
        result = solution(n)

        # then
        self.assertEqual(2, result)

    def test_2(self):
        # given
        n = 8

        # when
        result = solution(n)

        # then
        self.assertEqual(0, result)

    def test_3(self):
        # given
        n = 1

        # when
        result = solution(n)

        # then
        self.assertEqual(1, result)

    def test_4(self):
        # given
        n = 25

        # when
        result = solution(n)

        # then
        self.assertEqual(5, result)

    def test_5(self):
        # given
        n = 1024

        # when
        result = solution(n)

        # then
        self.assertEqual(32, result)

    def test_6(self):
        # given
        n = 1000000

        # when
        result = solution(n)

        # then
        self.assertEqual(1000, result)


if __name__ == '__main__':
    unittest.main()
