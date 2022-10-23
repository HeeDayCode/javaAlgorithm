package programmers.level1.twoWeek.day1016;

public class AbsSum {

	public static int main(String[] args) {
		int answer=0;
		int a=3;
		int b=5;
		
        if(a < b){
            for(int i = a; i<= b; i++){
                answer += i;
            }
        }else if(a > b){
            for(int i = b; i <= a; i++){
                answer += i;
            }
        }else{
           answer = a;
        }

        return answer;
	}

}
