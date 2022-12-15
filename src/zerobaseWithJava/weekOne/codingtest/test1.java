package zerobaseWithJava.weekOne.codingtest;

public class test1 {
	class Solution {

	    private static int Is_Prime(int num)
	    {
	        int count = 0;

	        for(int i = 1; i <= num; i++)
	        {
	            if(num % i == 0)
	                count += 1;
	            if(count >= 3)
	                return count;
	        }
	        
	        return count;
	    }

	    public int solution(int n) {
	        int answer = 0;
	        for(int i =1 ; i< n ; i++){
	            //System.out.println("i: "+i);
	            //System.out.println("Is_Prime(i)"+Is_Prime(i));
	            if(Is_Prime(i)==2){
	                answer++;
	            }
	        }
	        
	        //System.out.println("answer: "+answer);
	        
	        return answer;
	    }
	}
}
