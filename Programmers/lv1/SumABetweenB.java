package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12912
 * Input: 3, 5
 * Output: 12
 */
public class SumABetweenB {

	public static void main(String[] args) {
		System.out.println(solution(36, 2));
	}
	public static long solution(int a, int b) {
	      long answer = 0;
	      if(a == b) return a;
	      if(b < a){
	          int temp = a;
	          a = b;
	          b = temp;
	      }
	      for(int i = a; i <= b; i++){
	          answer += i;
	      }
	      return answer;
	  }
}
