package zerobaseWithJava.weekTwo.pratice5Set.threeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class orderFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 순서 1. 배열을 List로 변환
		int[] originArray = { 11,22,33,44 };
		int Val = 55;
		
	    //List<Integer> newList = new ArrayList<>(Arrays.asList(Integer.parseInt(originArray)));
	    List<int[]> newList = Arrays.asList(originArray);
	    // 순서 2. List의 Add() 메서드를 호출하여 새로운 값을 할당
	    //newList.add(Val);

	    // 순서 3. List를 배열을 변환 후 반환
	    newList.toArray(new String[0]);
	    
	    System.out.println(Arrays.toString(newList.toArray(new String[0])));

	}

}
