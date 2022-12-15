package zerobaseWithJava.weekOne.codingtest;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class test2 {

    String[] strArray = new String[] {"B", "B", "C", "C", "A", "A", "A"};

    // 배열을 LinkedHashSet으로 변환합니다.
    LinkedHashSet<String> linkedHashSet = 
    new LinkedHashSet<>( Arrays.asList(strArray) );

    // LinkedHashSet을 배열로 변환홥니다.
    String[] strArrayWithoutDuplicates = 
    linkedHashSet.toArray(new String[] {});

    //System.out.println( Arrays.toString(strArrayWithoutDuplicates) );
 
}
