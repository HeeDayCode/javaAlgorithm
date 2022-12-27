package zerobaseWithJava.weekThree.AnswerStudy.oneTest.problem4;


class Solution {
    public int solution (int n, int i, int j) {
        return recursion(0, n, i, j);
    }

    private int recursion(int count, int n, int i, int j) {
        if (n == 2) {
            if (i == 0 & j == 1) {
                return count + 1;
            } else if (i == 0 & j == 0) {
                return count + 2;
            } else if (i == 1 & j == 0) {
                return count + 3;
            } else {
                return count + 4;
            }
        }

        int m = n / 2;
        if (i < m & j >= m) {
            return recursion(count, m, i, j - m);
        } else if (i < m & j < m) {
            count += m * m;
            return recursion(count, m, i, j);
        } else if (i >= m & j < m) {
            count += m * m * 2;
            return recursion(count, m, i - m, j);
        } else {
            count += m * m * 3;
            return recursion(count, m, i - m, j - m);
        }
    }
}
