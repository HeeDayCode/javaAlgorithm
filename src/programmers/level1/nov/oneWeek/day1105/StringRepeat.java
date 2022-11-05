package programmers.level1.nov.oneWeek.day1105;

public class StringRepeat {

	public static void main(String[] args) {
		 String answer = "";
		 int n = 5;

	        for(int i =0 ; i <n/2 ; i++){
	            answer += "수박";
	        }

	        if(n%2 !=0){ 
	            answer += "수";
	        }

	        System.out.println(answer);
	}

}
