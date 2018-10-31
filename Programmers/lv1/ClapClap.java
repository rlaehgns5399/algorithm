package Programmers.lv1;

/* 
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 * Input: 3
 * Output: "수박수"
 * 
 * Input: 4
 * Output: "수박수박"
 */
public class ClapClap {

	public static void main(String[] args) {
		System.out.println(solution(5));
	}
	public static String solution(int n) {
	      String answer = "";
	      for(int i = 0; i < n; i++){
	          if(i % 2 == 1){
	              answer += "박";
	          } else {
	              answer += "수";
	          }
	      }
	      return answer;
	  }
}
