package programmers.level1.threeeWeek.day1023;

import java.util.Arrays;

public class ArrayPush {

	public static void main(String[] args) {

		int cnt=0;
		int[] arr=	{5, 9, 7, 10};	
		int divisor=	5;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0) cnt++;
        }

        if(cnt==0){
            int[] answer={-1};
            System.out.println(answer);
        }
        int[] answer=new int[cnt];
        for(int i=0,j=0; i<arr.length; i++){
            if(arr[i]%divisor==0) answer[j++]=arr[i];
        }

        Arrays.sort(answer);
        System.out.println(answer);

	}
}
