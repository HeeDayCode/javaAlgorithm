import unittest

from src.com.luckydave.algorithm.fastcampus.supereasy.AsciiToString.AsciiToString import solution


class CustomTestCase(unittest.TestCase):

    def test_1(self):
        # given
        arr = [71, 111, 111, 103, 108, 101]

        # when
        result = solution(arr)

        # then
        self.assertEqual('Google', result)

    def test_2(self):
        # given
        arr = [65, 108, 71, 111, 82, 105, 116, 72, 109]

        # when
        result = solution(arr)

        # then
        self.assertEqual('AlGoRitHm', result)

    def test_3(self):
        # given
        arr = []

        # when
        result = solution(arr)

        # then
        self.assertEqual('', result)

    def test_4(self):
        # given
        arr = [65]

        # when
        result = solution(arr)

        # then
        self.assertEqual('A', result)

    def test_5(self):
        # given
        arr = [122]

        # when
        result = solution(arr)

        # then
        self.assertEqual('z', result)

    def test_6(self):
        # given
        arr = [119, 111, 114, 107]

        # when
        result = solution(arr)

        # then
        self.assertEqual('work', result)


if __name__ == '__main__':
    unittest.main()
