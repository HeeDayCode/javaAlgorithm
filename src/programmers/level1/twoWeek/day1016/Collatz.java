package programmers.level1.twoWeek.day1016;

public class Collatz {

	public static void main(String[] args) {
       
        long number = num;
        int answer = 0;
        for(answer = 0; answer < 500; answer++){
            if(number == 1) {} //return answer;
            else{
                if(number % 2 == 0) number /= 2;
                else number = number * 3 + 1;
            }
        } 
        //return -1;
        
        //System.out.println(resultCount);

	}

}
