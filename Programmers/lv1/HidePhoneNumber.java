package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12948
 * Input: 01033334444
 * Output: *******4444
 */
public class HidePhoneNumber {

	public static void main(String[] args) {
		String s = "027778888";
		s = solution(s);
		System.out.println(s);

	}
	 public static String solution(String phone_number) {
	      String answer = "";
		      for(int i = 0; i < phone_number.length(); i++){
		    	  try{
		    		  int p = Integer.parseInt(String.valueOf(phone_number.charAt(i)));
		    		  answer = answer + p;
		    	  } catch ( NumberFormatException e){
		    		  
		    	  }
		      }
		      String result = "";
		      for(int i = 0; i < answer.length()-4; i++){
		    	  result += "*";
		      }
		      for(int i = answer.length()-4; i < answer.length(); i++){
		    	  result += answer.charAt(i);
		      }
		      return result;
	  }
}
