package greedy;

/*그리디 알고리즘
 * 1. 가장 최선이라 생각되는 방식 생각
 * 2. 전체 문제가 제약조건에 벗어나지 않는 지 검사
 * 3. 전체 문제를 해결하지 못하면 1로 돌아가기
 * */

import java.util.Scanner;
public class greedy1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    int count = 0;
    for (int i = N - 1; i >= 0; i--) {
      if (A[i] <= K) { // 현재 동전의 가치가 K보다 작거나 같으면 구성에 추가한다.
        count += (K / A[i]);
        K = K % A[i]; // K를 현재 동전을 사용하고 남은 금액으로 업데이트 함
      }
    }
    System.out.println(count);
  }
}

