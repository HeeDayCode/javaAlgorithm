package storage.greedy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class numberGroup {
  public static void main(String[] args) {
	  
	//=================입력=================
    Scanner sc = new Scanner(System.in);
    int cardGroup = sc.nextInt(); // 카드 묶음의 수 저장

    PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder()); //우선순위큐를 사용함으로써 내림차순 정렬
    PriorityQueue<Integer> minusPq = new PriorityQueue<>();							 //음수
    int one = 0;		//1따로
    int zero = 0;		//0따로
    for (int i = 0; i < cardGroup; i++) { // 4개의 그룹으로 분리하여 저장
      int data = sc.nextInt();
      if (data > 1) {
        plusPq.add(data);
      } else if (data == 1) {
        one++;
      } else if (data == 0) {
        zero++;
      } else {
        minusPq.add(data);
      }
    }
        
    //=================로직=================
    int sum = 0;
    // 양수처리
    while (plusPq.size() > 1) {
      int first = plusPq.remove();
      int second = plusPq.remove();
      sum = sum + first * second;
    }
    if (!plusPq.isEmpty()) {
      sum = sum + plusPq.remove();
    }
    // 음수처리
    while (minusPq.size() > 1) {
      int first = minusPq.remove();
      int second = minusPq.remove();
      sum = sum + first * second;
    }
    if (!minusPq.isEmpty()) {
      if (zero == 0) {
        sum = sum + minusPq.remove();
      }
    }
    // 1처리
    sum = sum + one;
    System.out.println(sum);
  }
}

