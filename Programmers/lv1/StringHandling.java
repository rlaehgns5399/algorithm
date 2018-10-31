package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12918
 * Input: "a123"
 * Ouput: false
 */
public class StringHandling {

	public static void main(String[] args) {
		System.out.println(solution("a234"));
	}
	public static boolean solution(String s) {
	      boolean answer = false;
	      if(s.length() == 4 || s.length() == 6){
	          try{
	              Integer.parseInt(s);
	              return true;
	          } catch (Exception e){
	              return false;
	          }
	      }
	      return answer;
	  }
}
