package zerobaseWithJava.weekOne.miniPractice;

public class MultiplicationTable {
//1번 과제 고은희
	public MultiplicationTable(int num) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i < 10; i++) {
			//System.out.println("i: "+i);
			System.out.print(String.format("%02d", i) + " x " + String.format("%02d", num)+" = "+String.format("%02d", i*num)+"      ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[구구단 출력]");
		for (int step = 1; step < 10; step++) {
			MultiplicationTable multi = new MultiplicationTable(step);
			System.out.println("");
		}
		
	}

}
