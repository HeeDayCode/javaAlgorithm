import unittest

from src.com.luckydave.algorithm.fastcampus.supereasy.HexadecimalToBinary.HexadecimalToBinary import solution


class CustomTestCase(unittest.TestCase):

    def test_1(self):
        # given
        s = 'f4'

        # when
        result = solution(s)

        # then
        self.assertEqual('11110100', result)

    def test_2(self):
        # given
        s = 'f'

        # when
        result = solution(s)

        # then
        self.assertEqual('1111', result)

    def test_3(self):
        # given
        s = 'abc'

        # when
        result = solution(s)

        # then
        self.assertEqual('101010111100', result)

    def test_4(self):
        # given
        s = 'f59'

        # when
        result = solution(s)

        # then
        self.assertEqual('111101011001', result)

    def test_5(self):
        # given
        s = 'ca041'

        # when
        result = solution(s)

        # then
        self.assertEqual('11001010000001000001', result)

    def test_6(self):
        # given
        s = '27182'

        # when
        result = solution(s)

        # then
        self.assertEqual('100111000110000010', result)


if __name__ == '__main__':
    unittest.main()
