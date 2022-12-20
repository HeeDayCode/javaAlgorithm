import unittest

from src.com.luckydave.algorithm.fastcampus.supereasy.JoinLetter.JoinLetter import solution


class CustomTestCase(unittest.TestCase):

    def test_1(self):
        # given
        arr = ['naver', 'kakao']

        # when
        result = solution(arr)

        # then
        self.assertEqual('naver,kakao', result)

    def test_2(self):
        # given
        arr = ['b', 'b', 'c']

        # when
        result = solution(arr)

        # then
        self.assertEqual('b,b,c', result)

    def test_3(self):
        # given
        arr = ['z', 'b', 'p', 'q', 'd']

        # when
        result = solution(arr)

        # then
        self.assertEqual('z,b,p,q,d', result)

    def test_4(self):
        # given
        arr = ['e', 't', 'c']

        # when
        result = solution(arr)

        # then
        self.assertEqual('e,t,c', result)

    def test_5(self):
        # given
        arr = ['vts', 'kah', 'pka']

        # when
        result = solution(arr)

        # then
        self.assertEqual('vts,kah,pka', result)

    def test_6(self):
        # given
        arr = ['quoef', 'ixyaw', 'vpkqa', 'iyxal', 'dwlzj']

        # when
        result = solution(arr)

        # then
        self.assertEqual('quoef,ixyaw,vpkqa,iyxal,dwlzj', result)


if __name__ == '__main__':
    unittest.main()
