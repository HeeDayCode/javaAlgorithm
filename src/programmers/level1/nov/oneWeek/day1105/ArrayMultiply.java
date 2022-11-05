package programmers.level1.nov.oneWeek.day1105;

public class ArrayMultiply {

	public static void main(String[] args) {
		int answer = 0;
		int[] a = {1,2,3,4};
		int[] b = {-1,2,13,4};

        for(int i = 0 ; i< a.length ; i++){
            answer += a[i]*b[i];
        }

        System.out.println(answer);
	}

}
