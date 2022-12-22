package zerobaseWithJava.weekTwo.pratice5Set.twoSet;

public class shiftMove3 {

	public static void main(String[] args) {
		 //Scanner kb = new Scanner(System.in);
	        //int n = kb.nextInt();
	        int[] data = {1,2,3,4,5};

	       // int tmp = data[data.length-1]; // 배열의 맨 마지막 값
	        for(int i=data.length-2; i>=0; i--) {
	        	 data[i+1] = data[i]; 
	        } // 배열의 맨 마지막 값을 제외한 마지막 값
	           // 한 칸씩 뒤로 이동
	       // data[0] = tmp;
	        
	        for(int i=0; i<data.length; i++)
	            System.out.println(data[i]);
	    }

}
