package storage.greedy;

/*그리디 알고리즘
 * 1. 가장 최선이라 생각되는 방식 생각
 * 2. 전체 문제가 제약조건에 벗어나지 않는 지 검사
 * 3. 전체 문제를 해결하지 못하면 1로 돌아가기
 * */

import java.util.PriorityQueue;
import java.util.Scanner;

public class cardJoinCnt {
  public static void main(String[] args) {
	
	//=================입력=================  
    Scanner sc = new Scanner(System.in);
    int cardGroupCnt = sc.nextInt(); 
    PriorityQueue<Integer> cardGroup = new PriorityQueue<>();	//우선순위큐를 사용함으로써 자동정렬
    for (int i = 0; i < cardGroupCnt; i++) {
      int data = sc.nextInt();
      cardGroup.add(data);
    }
    
    //=================로직=================
    int choice1 = 0;
    int choice2 = 0;
    int resultCnt = 0;
    while (cardGroup.size() != 1) {
    	choice1 = cardGroup.remove(); 							//제거하면서 값을 받아옴
    	choice2 = cardGroup.remove();
    	resultCnt += choice1 + choice2;
      cardGroup.add(choice1 + choice2);							//추가를 하면서 자동 정렬 오름차순
    }
    System.out.println(resultCnt);
  }
}


