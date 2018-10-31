package Programmers.lv1;
 
/* https://programmers.co.kr/learn/courses/30/lessons/12943
 * Input: 6
 * Result: 8
 * 
 * Input: 16
 * Result: 4
 * 
 * Input: 626332
 * Result: -1
 */
public class CollatzGuess {

	public static void main(String[] args) {
		System.out.println(solution(1112));
	}
	public static int solution(int num) {
	      int answer = 0;
	      
	      while (num != 1){
	          if(num % 2 == 0) {
	              num /= 2;
	          } else {
	              num = num * 3 + 1;
	          }
	          if(answer == 450) return -1;
	          answer++;
	      }
	      return answer;
	  }
}
