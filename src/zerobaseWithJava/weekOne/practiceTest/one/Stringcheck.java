package zerobaseWithJava.weekOne.practiceTest.one;

import java.util.Arrays;

public class Stringcheck {

	public static void main(String[] args) {
		int answer = 0;
        int max = 0;
        String s = "123927821";
        int[] count = new int[10];

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<10; j++){
                if( s.charAt(i) == Character.forDigit(j, 10) ) count[j]++;
            }
        }
        for(int i=0; i<10; i++){
            if(count[i]>max){
                max = count[i];
                answer = i;
            }
        }
        System.out.println(answer);

	}

}
