package zerobaseWithJava.weekTwo.pratice5Set.threeSet;

import java.util.Arrays;

public class stringCheck {

	public static void main(String[] args) {
		String[] answer = new String[10];
		String s = "00221213";
		String[] strArr = s.split("");

        for(String i : strArr){
            System.out.println("i: "+i);
        }
        String strArrayToString = String.join("", strArr);
        //System.out.println(Arrays.toString(strArr));
        System.out.println(strArrayToString);
        
        
        int[] num = new int[s.length()];	// 추출한 각 자리의 숫자를 저장할 배열
		int[] cnt = new int[10];	// 추출한 숫자가 쓰인 횟수 저장할 배열
		
		for(int i=0; i<num.length; i++) {
			num[i] = s.charAt(i)-'0';	// 문자열에서 각 자리 수 추출
			cnt[num[i]]++;	// 추출한 숫자의 자리(cnt[추출한 값])에 횟수 증가
		}
		
		System.out.println(Arrays.toString(cnt));
		
		
		int[] result = new int[10];
		int[] resultInt = new int[10];
		
		
		
        
	}

}
