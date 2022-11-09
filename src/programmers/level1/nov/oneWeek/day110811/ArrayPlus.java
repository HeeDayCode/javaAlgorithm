package programmers.level1.nov.oneWeek.day110811;

public class ArrayPlus {
	public static void main(String[] args) {
		
		int[][] arr1 = {{ 10, 20, 30 },{ 40, 50, 60 }};
		int[][] arr2 = {{ 40, 60, 30 },{ 40, 70, 10 }};
		
		
		int[][] arr = new int[arr1.length][arr1[0].length]; // @1
        for(int i=0; i<arr1.length; i++) { // @2
            for(int j=0; j<arr1[0].length; j++) { // @3
                arr[i][j] = arr1[i][j] + arr2[i][j]; // @4
            }
        }
        
        System.out.println(arr);
	}

}
