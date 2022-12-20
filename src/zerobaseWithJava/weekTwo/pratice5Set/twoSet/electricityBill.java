package zerobaseWithJava.weekTwo.pratice5Set.twoSet;

public class electricityBill {

	public static void main(String[] args) {
		int answer = 0;
        int sum = 0;
        int[] useageArr = {2,34,5,1,7};
        int fee = 10;
        for(int i:useageArr){
            sum = sum + i;
        }
        //System.out.println("sum: "+sum);
        System.out.println(sum*fee);
	}

}
