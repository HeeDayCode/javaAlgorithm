package programmers.level1.threeeWeek.day1028;

public class PlusNum {

	public static void main(String[] args) {
		 int sum = 0;
		 int[] absolutes= {4,7,12};
		 boolean[] signs= {true, false, true};
		 
	        //true 양수 false 음수
	         
	        for(int i = 0; i < absolutes.length; i++){
	            //* -1 음수 만들기
	            if(signs[i] == false){
	                absolutes[i] *= -1;
	            }
	            sum += absolutes[i];
	        } 
	 
	       System.out.println(sum);

	}

}
