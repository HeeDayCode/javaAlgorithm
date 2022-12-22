package zerobaseWithJava.weekTwo.pratice5Set.mainTest;

public class stringRepeat {

	// 반복내용 횟수
	public static String repeatString(String repeatStr, int num) {
		String repeated = repeatStr.repeat(num);
		return repeated;
	}

	public static void main(String[] args) {
		String answer = "";
		String code = "5{he2{l}o}friend";
		int repeatNum = 0;
		int startIndex = 0;
		int endIndex = 0;
        String[] fullCode = code.split("");
        String repeatStr= "";

        //{ 마지막 인덱스
        for(int i = 0; i< fullCode.length ; i++){
            if(fullCode[i].equals("{")){
                startIndex = i+1;
                repeatNum = Integer.parseInt(fullCode[i-1]);   
            } 
        }
        //} 처음 인덱스
        for(int i = 0; i< fullCode.length ; i++){
            if(fullCode[i].equals("}")){
                endIndex = i-1;
                break;
            } 
        }
        System.out.println("repeatNum: "+repeatNum+", startIndex: "+startIndex+", endIndex: "+endIndex);
        for (int i = startIndex; i <= endIndex; i++) {
        	repeatStr = repeatStr+fullCode[i];
		}
        
        System.out.println(repeatStr);
        System.out.println("result: "+repeatString(repeatStr,repeatNum));
		
		
		
		
		
		
	}

}
