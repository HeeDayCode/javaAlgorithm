import unittest

from src.com.luckydave.algorithm.fastcampus.supereasy.MostAppearLetter.MostAppearLetter import solution


class CustomTestCase(unittest.TestCase):

    def test_1(self):
        # given
        s = 'google'

        # when
        result = solution(s)

        # then
        self.assertEqual('g', result)

    def test_2(self):
        # given
        s = 'algorithm'

        # when
        result = solution(s)

        # then
        self.assertEqual('a', result)

    def test_3(self):
        # given
        s = 'ajseifnaslgksadkjfsdjfklskfjlsajlf'

        # when
        result = solution(s)

        # then
        self.assertEqual('s', result)

    def test_4(self):
        # given
        s = 'zfa'

        # when
        result = solution(s)

        # then
        self.assertEqual('a', result)

    def test_5(self):
        # given
        s = 'a'

        # when
        result = solution(s)

        # then
        self.assertEqual('a', result)

    def test_6(self):
        # given
        s = 'z'

        # when
        result = solution(s)

        # then
        self.assertEqual('z', result)


if __name__ == '__main__':
    unittest.main()
