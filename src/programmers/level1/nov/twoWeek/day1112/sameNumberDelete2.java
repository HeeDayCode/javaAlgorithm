package programmers.level1.nov.twoWeek.day1112;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sameNumberDelete2 {
	
	public int[] deleteIndex(int []arr, int deleteNum) {
		int[] result = new int[arr.length];

		int[] ints = {1, 2, 3};
		List<Integer> intList = new ArrayList<Integer>(result.length);
		for (int i =0; i < result.length ; i++)
		{
		    intList.add(i);
		}
		
		intList.remove(deleteNum);
		
		int[] arr1 = new int[intList.size()];
	    for (int i = 0 ; i < intList.size() ; i++) {
	    	result[i] = intList.get(i).intValue();
	    }
		 
		return result;
	}
	
	
	public static void main(String[] args) {
		int []arr = {1,1,2,3,4,5};
		sameNumberDelete2 result = new sameNumberDelete2();
		System.out.println(Arrays.toString(result.deleteIndex(arr, 2)));
		
	}

}
