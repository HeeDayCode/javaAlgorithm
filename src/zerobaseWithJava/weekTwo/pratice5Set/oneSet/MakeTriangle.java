package zerobaseWithJava.weekTwo.pratice5Set.oneSet;

import java.util.Arrays;
import java.util.Collections;

public class MakeTriangle {
	 public static boolean passTriangleCheck(int num1, int num2, int num3) {
			// TODO Auto-generated constructor stub
			boolean passCheck = false;
			
			//System.out.printf("%d / %d / %d",num1,num2,num3);
			
	        int result1 = 0; 	 //= (num1 <= num2)? num1: num2;
	        int result2 = 0;	 //= (num1 >= num2)? num1: num2;//숫자 두개를 비교해서 더 큰 값을 저장한다. 
	        int result3 = 0;	 //= (num1 >= num2)? num1: num2;//숫자 두개를 비교해서 더 큰 값을 저장한다. 
	        
	        if(num1 >= num2) {
	        	 result2 = num1;
	        	 result1 = num2;
	        	 if(num3>= num1) {
	        		 result3 = num3;
	        	 }else {
	        		 result3 = num1;
	        		 result2 = num3;
	        	 }
	        }else {
	        	 result2 = num2;
	        	 result1 = num1;
	        	 if(num3>= num2) {
	        		 result3 = num3;
	        	 }else {
	        		 result3 = num2;
	        		 result2 = num3;
	        	 }
	        }

	        //긴변이 짧은 두변의 합보다 작다
	        if(result3>=(result1+result2)) {
	        	passCheck = true;
	        }
	        //System.out.printf("%d / %d / %d",result1,result2,result3);
	        //System.out.println(passCheck);
	        return passCheck;

		}
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		  int answer = 0;
		  int[] arr= {3,4,6,7,5};
	        //N개의 정수중 3개 고르기
			Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);
			Arrays.sort(arrInteger, Collections.reverseOrder());

			for(int i = 0; i <arr.length-2; i++) {
				if(passTriangleCheck(arrInteger[i],arrInteger[i+1],arrInteger[i+2])) {
					System.out.println(arrInteger[i]+arrInteger[i+1]+arrInteger[i+2]);
					break;
				}else {
					System.out.println(0);
				}
			}
	        
		}

}
