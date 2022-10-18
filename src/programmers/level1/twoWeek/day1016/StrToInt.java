package programmers.level1.twoWeek.day1016;

public class StrToInt {

	public static void main(String[] args) {
		int answer = 0;
		String s = "-1234";
        String answerString = "";
        String[] temp = String.valueOf(s).split("");
        
        //System.out.println(Arrays.toString(temp));

        if(temp[0].equals("-")){
            answerString = temp[0];
            for (int i = 1; i < temp.length; i++) {
            answerString += temp[i];
            }  
        }else{
            for (int i = 0; i < temp.length; i++) {
            answerString += temp[i];
            }  
        }
        System.out.println(Integer.parseInt(answerString));
	}

}
