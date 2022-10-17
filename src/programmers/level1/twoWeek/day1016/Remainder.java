package programmers.level1.twoWeek.day1016;

public class Remainder {

	
	public static void main(String[] args) {
		 int answer = 1;
		 int n = 30 ;
	        while(true){
	            if(n%answer == 1){
	                break;
	            }else{
	                answer += 1;
	            } 
	        }
	        System.out.println(answer);
	    }

	}


