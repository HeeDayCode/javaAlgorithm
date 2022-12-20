import unittest

from src.com.luckydave.algorithm.fastcampus.supereasy.SwitchUpperLowerCase.SwitchUpperLowerCase import solution


class CustomTestCase(unittest.TestCase):

    def test_1(self):
        # given
        s = 'Naver'

        # when
        result = solution(s)

        # then
        self.assertEqual('nAVER', result)

    def test_2(self):
        # given
        s = 'Kakao'

        # when
        result = solution(s)

        # then
        self.assertEqual('kAKAO', result)

    def test_3(self):
        # given
        s = 'CoFFee'

        # when
        result = solution(s)

        # then
        self.assertEqual('cOffEE', result)

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
        self.assertEqual('a', result)

    def test_6(self):
        # given
        s = 'v'

        # when
        result = solution(s)

        # then
        self.assertEqual('V', result)


if __name__ == '__main__':
    unittest.main()
