package zerobaseWithJava.weekTwo.pratice5Set.twoSet;

public class shiftMove {

	// 홀수인지 확인
	public static boolean oddNumChk(int num) {
		boolean result = false;
		// System.out.println("num: "+num);
		if (num != 0 && num % 2 == 1) {
			result = true;
		}
		// System.out.println("result: "+result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 2, 1, 4, 3, 0 };
		int[] answer = arr;

		int firstOddNum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (oddNumChk(arr[i])) {
				for (int j = i; j < arr.length - 2; j++) {
					//System.out.println("j " + j);
					//System.out.println("arr[j]: " + arr[j]);
					//answer[j + 1] = arr[j];
					int temp = arr[j];
					answer[j+1] = temp;
				}
				break;
			}
			
		}

		
		 for(int i:answer)
		 { System.out.print(i+" "); }
		 

	}

}
