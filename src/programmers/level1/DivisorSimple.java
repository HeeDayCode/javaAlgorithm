package programmers.level1;

public class DivisorSimple {

	public int sumDivisor(int num) {
        int answer = 0;
            for(int i = 1; i <= num/2; i++){
        if(num%i == 0) answer += i;
      }
        return answer+num;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
    	DivisorSimple c = new DivisorSimple();
        System.out.println(c.sumDivisor(12));
    }
}
