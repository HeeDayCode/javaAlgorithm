package zerobaseWithJava.weekTwo.pratice5Set.twoSet;

public class sqrtFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long b =15;
		//System.out.println(Math.sqrt(b));
		long max = (long) Math.sqrt(b);
		long check = (long) Math.pow(max, 3);
		System.out.println(max);
		System.out.println(b);
		System.out.println(check);
		while(true) {
			if(b<check) {
				System.out.println("---------------");
				max--;
				check = (long) Math.pow(max, 3);
			}else {
				break;
			}
		}

		System.out.println((int)Math.pow(max, 3));
	}

}
