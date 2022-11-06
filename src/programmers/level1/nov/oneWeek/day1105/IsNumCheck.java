package programmers.level1.nov.oneWeek.day1105;

public class IsNumCheck {

	public static boolean main(String[] args) {
		String s = "d234";
		if(s.length() == 4 || s.length() == 6){
	          try{
	              int x = Integer.parseInt(s);
	              return true;
	          } catch(NumberFormatException e){
	              return false;
	          }
	      }
	      else return false;
	}

}
