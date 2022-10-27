package programmers.level1.threeeWeek.day1023;

public class Masking {

	public static void main(String[] args) {
		String answer = "";
		
		
		
		
		String phone_number = "010222222";
        String[] temp = String.valueOf(phone_number).split("");
         
        for(int i = 0; i<temp.length -4 ;i++){
            temp[i] = "*";
        }
        
        for (String s : temp) {
			answer +=   s;
		}
        System.out.println(answer);
	}

}
