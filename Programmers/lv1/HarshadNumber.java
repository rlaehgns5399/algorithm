package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12947
 * Input: 10
 * Output: true
 * 
 * Input: 11
 * Output: false
 */
public class HarshadNumber {

	public static void main(String[] args) {
		System.out.println(solution(10));

	}
	public static boolean solution(int x) {
	      int a = x;
	      int sum = 0;
	      while(a > 0){
	          sum += a % 10;
	          a = a / 10;
	      }
	      if(x % sum == 0) return true;
	      return false;
	      
	  }
}
