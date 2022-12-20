package zerobaseWithJava.weekTwo.pratice5Set.twoSet;

public class shiftMove2 {

	// 배열 오른쪽이동
//	public static int[] rigthMove(int[] arr, int num) {
//		arr[i]
//		return arr;
//	}
	
	/* 배열 뒤집기를 위한 배열 인덱스끼리 변경 메서드 */
	  private static void swap(int[] arr, int idx1, int idx2) {
	    int temp = arr[idx1];
	    arr[idx1] = arr[idx2];
	    arr[idx2] = arr[idx2];
	  }
	  
	private static void reverse(int[] arr, int start, int end) {
	    int end1 = end - 1; // 배열 마지막 인덱스는 배열 길이 - 1이기 때문에
	    while(start < end1) { // 반복을 (start ~ end) -> (start + 1 ~ end - 1) ... 까지 진행
	      swap(arr, start, end1);
	      start++;
	      end1--;
	    }
	  }
	
	 private static void rightShift(int[] arr, int n) {
		    int size = arr.length;
		    reverse(arr, 0, n);
		    reverse(arr, n, size);
		    reverse(arr, 0, size);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 2, 1, 4, 3, 0 };
		//int[] answer = arr;

		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 ==1) {
				System.out.println("arr[i]: "+arr[i]);
				for(int k:arr){ System.out.print(k+" "); }
				rightShift(arr,i);
				for(int k:arr){ System.out.print(k+" "); }
				break;
			}
			
		}

		
		
		 

	}

}
