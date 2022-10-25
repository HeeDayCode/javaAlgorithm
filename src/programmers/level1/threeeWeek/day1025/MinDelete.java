package programmers.level1.threeeWeek.day1025;

import java.util.Arrays;

public class MinDelete {

	/*
	 * private static String[] Add(String[] originArray, String Val) { // 순서 1. (원본
	 * 배열의 크기 + 1)를 크기를 가지는 배열을 생성 String[] newArray = new String[originArray.length
	 * + 1];
	 * 
	 * // 순서 2. 새로운 배열에 값을 순차적으로 할당 for(int index = 0; index < originArray.length;
	 * index++) { newArray[index] = originArray[index]; }
	 * 
	 * // 순서 3. 새로운 배열의 마지막 위치에 추가하려는 값을 할당 newArray[originArray.length] = Val;
	 * 
	 * // 순서 4. 새로운 배열을 반환 return newArray; }
	 */
	  public static void main(String args[]) {
			/*
			 * String[] strArray = { "AA", "BB", "CC", "DD" };
			 * 
			 * System.out.println("\"EE\" 추가 전: " + Arrays.toString(strArray)); strArray =
			 * Add(strArray, "EE"); System.out.println("\"EE\" 추가 후: " +
			 * Arrays.toString(strArray));
			 */
		  
		  int[] arr = {2,3,4,5};
		  //배열 길이가 1인 경우 -1 반환
	        if(arr.length == 1){
	            int[] answer = {-1};
	            System.out.println(arr);
	        }

	        //배열길이가 1보다 클 때 가장 작은 수를 뺀 길이의 배열로
	        int[] answer = new int[arr.length-1];

	        int min = arr[0]; //하나의 값을 기준으로 잡음.

	        //가장 작은 수 구하기
	        for(int i = 0; i < arr.length; i++) {
	            min = Math.min(min, arr[i]);
	        }

	        int index = 0;  //반복문용 변수. 가장 작은 수가 여러개 일 수 있기 때문에 사용

	        for(int i = 0; i < arr.length; i++) {
	            if(arr[i] == min) {
	                continue;
	            }

	            answer[index++] = arr[i];
	        }

	        System.out.println(arr);
	  }


}
