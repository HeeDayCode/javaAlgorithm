package programmers.level1.twoWeek;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,2,3,4,5};
		
		int[] reverseArr = new int[n.length];
        // 원본배열(arr)의 마지막 인덱스(int i = arr.length - 1)부터 탐색하여        
        // 거꾸로 배열(reverseArr)에 순서대로 값을 세팅한다.        
        for (int i = n.length - 1, j = 0; i >= 0; i--, j++) {    
            reverseArr[j] = n[i];        
        }
		
		for(int i:reverseArr) {
			System.out.print(i+" ");
		}
		
	}

}
