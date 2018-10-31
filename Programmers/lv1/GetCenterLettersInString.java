package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12903
 * Input: qwer
 * Output: we
 */
public class GetCenterLettersInString {

	public static void main(String[] args) {
		System.out.println(solution("qwer"));
	}
	public static String solution(String s) {
	      if(s.length() % 2 == 0){
	          return s.substring((s.length()/2) - 1, s.length()/2+1);
	      } else {
	          return String.valueOf(s.charAt(s.length()/2));
	      }
	  }
}
