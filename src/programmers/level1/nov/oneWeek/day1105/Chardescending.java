package programmers.level1.nov.oneWeek.day1105;

import java.util.Arrays;

public class Chardescending {

	public static void main(String[] args) {
			String s = "acdsId";
			char arr[] = s.toCharArray();
	        Arrays.sort(arr);
	        StringBuilder sb = new StringBuilder(new String(arr,0, arr.length));
	        System.out.println(sb.reverse().toString());
	}

}
