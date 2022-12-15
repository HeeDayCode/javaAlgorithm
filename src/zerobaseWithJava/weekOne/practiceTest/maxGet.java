package zerobaseWithJava.weekOne.practiceTest;

public class maxGet {

	public static void main(String[] args) {
			int[] A = {10000,3000,7000,50000};
	        int answer = 0;
	        int max = 0;

	        for(int i = 0 ; i < A.length; i++){
	            for(int j =i+1; j < A.length ; j++){
	                if((A[j]-A[i])>max){
	                    max = A[j]-A[i];
	                    //System.out.println(max);
	                }    
	            } 
	        }
	         
	        System.out.println(max);
	    

	}

}
