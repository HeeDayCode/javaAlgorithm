import unittest

from src.com.luckydave.algorithm.fastcampus.supereasy.ReverseText.ReverseText import solution


class CustomTestCase(unittest.TestCase):

    def test_1(self):
        # given
        s = 'apple'

        # when
        result = solution(s)

        # then
        self.assertEqual('elppa', result)

    def test_2(self):
        # given
        s = 'ApPlE'

        # when
        result = solution(s)

        # then
        self.assertEqual('ElPpA', result)

    def test_3(self):
        # given
        s = 'Orange'

        # when
        result = solution(s)

        # then
        self.assertEqual('egnarO', result)

    def test_4(self):
        # given
        s = ''

        # when
        result = solution(s)

        # then
        self.assertEqual('', result)

    def test_5(self):
        # given
        s = 'A'

        # when
        result = solution(s)

        # then
        self.assertEqual('A', result)

    def test_6(self):
        # given
        s = 'z'

        # when
        result = solution(s)

        # then
        self.assertEqual('z', result)


if __name__ == '__main__':
    unittest.main()
