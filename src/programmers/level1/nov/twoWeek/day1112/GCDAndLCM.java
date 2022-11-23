package programmers.level1.nov.twoWeek.day1112;

public class GCDAndLCM {

	public static void main(String[] args) {
		int[] answer = new int[2];
		int num1 = 5;
		int num2 = 10;
		
        int max = 0; //최대 공약수

        for(int i=1; i<=num1 && i<=num2; i++) 
        {
            if(num1%i==0 && num2%i==0)
            {
                max = i;
            }
        }       

        
        
        
        
        
        
        int min = (num1*num2)/max; //최소 공배수

        answer[0] = max;
        answer[1] = min;

       System.out.println(answer[0]+" / "+answer[1]);

	}

}
