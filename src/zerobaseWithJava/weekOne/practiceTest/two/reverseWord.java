package zerobaseWithJava.weekOne.practiceTest.two;

import java.util.ArrayList;

public class reverseWord {

	public static void main(String[] args) {
		/*String[] arr = {"a", "b", "c", "d"};

		List<String> list = Arrays.asList(arr);

		list.forEach(System.out::println);
		list.remove("a");
        list.forEach(System.out::println);*/
		
		/*ArrayList<String> stringArrayList = new ArrayList<>();
		stringArrayList.add("One");
		stringArrayList.add("Two");
		stringArrayList.add("Three");
		stringArrayList.add("Four");

		System.out.println("\"Two\" 삭제 전");
		System.out.println(stringArrayList);

		System.out.println("\nremove() 메서드 반환 결과");
		System.out.println(stringArrayList.remove("Two"));

		System.out.println("\n\"Two\" 삭제 후");
		System.out.println(stringArrayList);*/
		
		String[] array = new String[3];



		array[0] = "Test1";

		array[1] = "Test2";

		array[2] = "Test3";



		ArrayList<String> arrayList = new ArrayList<>();

		for(String temp : array){

		  arrayList.add(temp);

		}
		arrayList.remove("Test3");
		System.out.println(arrayList);
	}

}
