package zerobaseWithJava.weekOne.practiceTest.one;

public class toTen {
	public static int ifTwo(int two){
        return two/2;
    }

    public static int ifOne(int one){
        return one-1;
    }
	public static void main(String[] args) {

	        int answer = 0;
	        int count = 0;
	        String S = "134431";
	        answer = Integer.parseInt(S, 2);
	        //System.out.println(answer);
	        
	        while(true){
	            System.out.println(answer);
	        if(answer%2 ==0 ){
	            answer = ifTwo(answer);
	            //System.out.println(answer);
	            count++;
	        }else{
	            answer = ifOne(answer);
	            //System.out.println(answer);
	            count++;
	        }
	        if(answer == 0) break;
	        }
	        System.out.println(answer);
	    
	}

}
