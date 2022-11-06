package programmers.level1.nov.oneWeek.day1105;

public class DivisorCount {

	public static void main(String[] args) {
		int answer = 0;
		int left = 13;
		int right = 17;
		
        for(int i = left; i<right+1; i++){
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) count++;
                else if (i % j == 0) count += 2;
            }
            //System.out.println(count);
            if(count%2 ==0){
               answer += i; 
            }else{
                answer -= i; 
            }
        }

        System.out.println(answer);
	}

}
