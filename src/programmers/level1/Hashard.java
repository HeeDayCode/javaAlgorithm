package programmers.level1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Hashard {
	
	//자리수 숫자 합 구하는 함수
    public int intSum(int num) {
		int[] digits = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
	    int result = Arrays.stream(digits).sum();
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashard sum = new Hashard();
		int x = 18;
		 boolean answer = false;
	        if(x % sum.intSum(x) == 0){
	            answer = true;
	        }
	        
		
	}


}
