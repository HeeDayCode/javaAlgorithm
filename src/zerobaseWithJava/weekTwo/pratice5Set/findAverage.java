package zerobaseWithJava.weekTwo.pratice5Set;

import java.util.Arrays;

public class findAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,34,5,6,9};
		Arrays.sort(arr);
        System.out.printf("max: %d, min :%d", arr[arr.length-1], arr[0]);
        System.out.println();
        
        int num = arr.length -2;
        int sum = 0;
        for(int i = 1;i <arr.length-1; i++){
            //System.out.println("arr["+i+"]: "+arr[i]);
            sum = sum + arr[i];
        }
        
        System.out.println((int)Math.floor(sum/num)); // 99
	}

}
