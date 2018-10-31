package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12919
 * Input: ["Jane", "Kim"]
 * Output: "김서방은 1에 있다"
 */
public class FindKimInSeoul {

	public static void main(String[] args) {
		String[] temp = {"Jane", "Kim"};
		System.out.println(solution(temp));
	}
	public static String solution(String[] seoul) {
	      for(int i = 0; i < seoul.length; i++){
	          if(seoul[i].equals("Kim")){
	              return "김서방은 " + i + "에 있다";
	          }
	      }
	      return "";
	  }
}
