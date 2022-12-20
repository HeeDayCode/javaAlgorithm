import unittest

from src.com.luckydave.algorithm.fastcampus.supereasy.BitXorCondition.BitXorCondition import solution


class CustomTestCase(unittest.TestCase):

    def test_1(self):
        # given
        arr = ['10110', '1010', '11110']

        # when
        result = solution(arr)

        # then
        self.assertEqual(2, result)

    def test_2(self):
        # given
        arr = ['1101']

        # when
        result = solution(arr)

        # then
        self.assertEqual(13, result)

    def test_3(self):
        # given
        arr = []

        # when
        result = solution(arr)

        # then
        self.assertEqual(0, result)

    def test_4(self):
        # given
        arr = ['101010', '10101']

        # when
        result = solution(arr)

        # then
        self.assertEqual(63, result)

    def test_5(self):
        # given
        arr = ['110011', '101010', '111110']

        # when
        result = solution(arr)

        # then
        self.assertEqual(39, result)

    def test_6(self):
        # given
        arr = ['11111', '1010101', '1110111']

        # when
        result = solution(arr)

        # then
        self.assertEqual(61, result)


if __name__ == '__main__':
    unittest.main()
