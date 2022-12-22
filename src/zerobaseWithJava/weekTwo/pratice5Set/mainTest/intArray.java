package zerobaseWithJava.weekTwo.pratice5Set.mainTest;

import java.math.BigInteger;
import java.util.Arrays;

public class intArray {

	public static void main(String[] args) {
		 int[] answer = {};
	        int aNum = 0;
	        int bNum = 0;
	        int index = 0;
	        int[] a = {5,2,1,4,6};
	        int[] b = {6,1,0,4,4};
	        BigInteger answerNum = new BigInteger("0");
	        //int answerNum = 0;

	        for(int i = a.length - 1; i >= 0; i--){
	            aNum = (int) (aNum + a[i]*Math.pow(10, index));
	            index++;
	            //System.out.println("aNum["+i+"]: "+aNum);
	        }
	        index = 0;
	        for(int i = b.length - 1; i >= 0; i--){
	            bNum = (int) (bNum + b[i]*Math.pow(10, index));
	            index++;
	            //System.out.println("bNum["+i+"]: "+bNum);
	        }
	        BigInteger aNumBig = BigInteger.valueOf(aNum);
	        //System.out.println(aNumBig); 
	        BigInteger bNumBig = BigInteger.valueOf(bNum);
	        //System.out.println(bNumBig); 
	        answerNum = aNumBig.add(bNumBig);
	        //System.out.println(answerNum); 
	        //System.out.println(answerNum.toString().length());
	        index = 0;
	        
	        //자리를 int[]
	        int num = 12345;
	        String strNum = Integer.toString(answerNum.intValue());
	        int[] arrNum = new int[strNum.length()];
	        for (int i = 0; i < strNum.length(); i++) {
	        	arrNum[i] = strNum.charAt(i) - '0';
	        }
	        System.out.print(Arrays.toString(arrNum)); 
	        
//	        BigInteger numData = new BigInteger("0");
//	        for(int i =0; i<answerNum.toString().length();i++) {
//	        	numData = answerNum.divide(BigInteger.valueOf((long) Math.pow(10, index)));
//	        	index++;
//	        	System.out.println(numData);
//	        }
	        
	        
//	        ArrayList<BigInteger> arrNum = new ArrayList<>();
//	        while(answerNum > 0) {
//	            arrNum.add((int) (answerNum %10));
//	            answerNum /= 10;
//	        }
	        

	}

}
