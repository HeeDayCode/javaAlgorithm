package greedy;

/*그리디 알고리즘
 * 1. 가장 최선이라 생각되는 방식 생각
 * 2. 전체 문제가 제약조건에 벗어나지 않는 지 검사
 * 3. 전체 문제를 해결하지 못하면 1로 돌아가기
 * */

import java.util.Scanner;
public class coinMinCnt {
  public static void main(String[] args) {
	  
	//=================입력=================  
    Scanner sc = new Scanner(System.in);
    int coinKindCnt = sc.nextInt();
    int makePrice = sc.nextInt();
    int[] coinPriceKind = new int[coinKindCnt];
    for (int i = 0; i < coinKindCnt; i++) {
    	coinPriceKind[i] = sc.nextInt(); 
    }

    //=================체크=================
    int needCoinCnt = 0;
    for (int i = coinKindCnt - 1; i >= 0; i--) {
      if (coinPriceKind[i] <= makePrice) { 					// 현재 동전의 가치가 makePrice보다 작거나 같으면 구성에 추가한다.
    	  needCoinCnt += (makePrice / coinPriceKind[i]); 	// 한 종류의 동전의 개수가 많다는 전제로 몫을 사용하여 계산
        makePrice = makePrice % coinPriceKind[i]; 			// makePrice를 현재 동전을 사용하고 남은 금액으로 업데이트 함(누적 계산)
      }
    }
    System.out.println(needCoinCnt);
  }
}

