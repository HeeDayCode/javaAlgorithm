package programmers.level1.nov.twoWeek.day1112;

import java.util.Arrays;

public class thingCollect {

	int t = 2;
	int n = 5;
	int k = 2;
	int[] nArray = {1,2,3,4,5};
	
	public int resultCnt(int cur, int cnt, int sum) {
		int result = 0;

		if(sum > t) return 0;
		
		if (cur == n) {
			if(cnt >= k) return 1;
			else return 0;
		}
		
		return resultCnt(cur+1, cnt+1, sum +nArray[cur]) + resultCnt(cur+1, cnt, sum);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		thingCollect result = new thingCollect();
		System.out.println(result.resultCnt(0,0,0));

	}

}
