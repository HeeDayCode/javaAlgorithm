package storage.septemberPractice2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class practiceImport {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		mData[] A = new mData[N];
		
		Arrays.sort(A);// A배열 정렬 O(nlogn)시간 복잡도
		System.out.println(A);
	}
}


class mData implements Comparable<mData> {
	int value;
	int index;

	public mData(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}

	@Override
	public int compareTo(mData o) {// value 기준 오름차순 정렬
		return this.value - o.value;
	}
}