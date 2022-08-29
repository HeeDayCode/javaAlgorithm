package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class meetingRoomTimeTable {
  public static void main(String[] args) {
	  
	//=================입력=================
    Scanner sc = new Scanner(System.in);
    int meetingRoomCnt = sc.nextInt();
    int[][] A = new int[meetingRoomCnt][2];
    for (int i = 0; i < meetingRoomCnt; i++) {
      A[i][0] = sc.nextInt();
      A[i][1] = sc.nextInt();
    }
    
    
    //=================로직=================
    Arrays.sort(A, new Comparator<int[]>() {	//정렬(종료시간기준 --> 시작시간기준)
      @Override
      public int compare(int[] Start, int[] End) {
        if (Start[1] == End[1]) { 				// 종료 시간이 같을 경우
          return Start[0] - End[0];
        }
        return Start[1] - End[1];
      }
    });

    int count = 0;
    int end = -1;
    for (int i = 0; i < meetingRoomCnt; i++) {
      if (A[i][0] >= end) { 					// 겹치지 않는 다음 회의가 나온경우
        end = A[i][1]; 							// 종료시간 업데이트
        count++;
      }
    }

    System.out.println(count);
  }
}

