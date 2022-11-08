package programmers.level1.nov.oneWeek.day1105;

public class PriceSum {

	public static void main(String[] args) {
		int count = 6;
		int price = 300;
		int money = 500;
		
		 long temp = 0;
	        for(int i = 1; i <= count; i++)
	        {
	            temp += i * price;            
	        }
	        if (temp > money)
	        	System.out.println(temp-money);
	        else System.out.println(0);
	}
}
