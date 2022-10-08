package programmers.level1;

public class StringFind {

	public static void main(String[] args) {
		
		String str ="heeday";
		
		// Creating array of string length
	    char[] arr = new char[str.length()];

	    // Copy character by character into array
	    for (int i = 0; i < str.length(); i++) {
	      arr[i] = str.charAt(i);
	    }

	    // Printing the character array
	    for (char x : arr) {
	      System.out.println(x);
	    }

	}

}
