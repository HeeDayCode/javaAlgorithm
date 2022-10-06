package programmers.level1;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntToArray {

	
	public int arraySum(int num) {
		int[] digits = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
	    //System.out.print( Arrays.toString(digits) );
	    int result = Arrays.stream(digits).sum();
        return result;
    }

	public static void main(String[] args) {
		IntToArray c = new IntToArray();
        System.out.println(c.arraySum(12));
	}

}










