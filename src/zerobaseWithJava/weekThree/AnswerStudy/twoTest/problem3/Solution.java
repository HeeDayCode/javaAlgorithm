package zerobaseWithJava.weekThree.AnswerStudy.twoTest.problem3;
class Solution {
    int i = 0;

    public String solution(String code) {
        return recursive(code);
    }

    public String recursive(String s)
    {
        StringBuilder sb = new StringBuilder();
        String temp;

        int num = 0;

        while(i < s.length()) {
            if(Character.isDigit(s.charAt(i))) {
                num = Character.getNumericValue(s.charAt(i));
                i++;
            } else if(s.charAt(i)=='{') {
                i++;
                temp = recursive(s);
                sb.append(temp.repeat(num));
            } else if(s.charAt(i)=='}') {
                i++;
                break;
            }
            else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }
}