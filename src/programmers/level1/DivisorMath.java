package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class DivisorMath {

	public static void main(String[] args) {
		int n = 12;
		int sqrt = (int) Math.sqrt(n); // 100의 제곱근은 10
		ArrayList<Integer> arr = new ArrayList<>(); // 약수 받을 ArrayList

		for (int i = 1; i <= sqrt; i++) {
			if (n % i == 0) { // 약수 중 작은 수 저장
				arr.add(i);
				if (n / i != i) { // 약수 중 큰 수 저장
					arr.add(n / i);
				}
			}
		}
		// Java 8 이후 사용 가능
		arr.sort(Comparator.naturalOrder());

		// 합계 계산
		IntSummaryStatistics statistics = arr.stream().mapToInt(num -> num).summaryStatistics();

		long result = statistics.getSum();
		int result2 = (int) result;

	}

}
