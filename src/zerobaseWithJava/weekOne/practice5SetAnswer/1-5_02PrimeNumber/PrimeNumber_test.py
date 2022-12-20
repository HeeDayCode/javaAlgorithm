import unittest

from src.com.luckydave.algorithm.fastcampus.supereasy.PrimeNumber.PrimeNumber import solution


class CustomTestCase(unittest.TestCase):

    def test_1(self):
        # given
        n = 7

        # when
        result = solution(n)

        # then
        self.assertEqual(True, result)

    def test_2(self):
        # given
        n = 417

        # when
        result = solution(n)

        # then
        self.assertEqual(False, result)

    def test_3(self):
        # given
        n = 633

        # when
        result = solution(n)

        # then
        self.assertEqual(False, result)

    def test_4(self):
        # given
        n = 92837

        # when
        result = solution(n)

        # then
        self.assertEqual(False, result)

    def test_5(self):
        # given
        n = 982374

        # when
        result = solution(n)

        # then
        self.assertEqual(False, result)

    def test_6(self):
        # given
        n = 73049183

        # when
        result = solution(n)

        # then
        self.assertEqual(True, result)


if __name__ == '__main__':
    unittest.main()
