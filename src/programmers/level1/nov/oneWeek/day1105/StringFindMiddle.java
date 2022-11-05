package programmers.level1.nov.oneWeek.day1105;

public class StringFindMiddle {

	public static void main(String[] args) {
			String answer = "";
			String str = "retd";
	        //배열로 변경
	        // Creating array of string length
	        char[] arr = new char[str.length()];

	        // Copy character by character into array
	        for (int i = 0; i < str.length(); i++) {
	          arr[i] = str.charAt(i);
	        }

	        //배열의 길이로 가운데 값 출력
	        if(arr.length%2 !=0){
	            answer = String.valueOf(arr[arr.length/2]);
	        }else{
	            answer = String.valueOf(arr[arr.length/2-1])+String.valueOf(arr[arr.length/2]);
	        }

	        System.out.println(answer);
	}

}
