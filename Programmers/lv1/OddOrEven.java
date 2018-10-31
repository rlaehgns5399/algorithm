package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12937
 * 
 */

public class OddOrEven {

	public static void main(String[] args) {
		System.out.println(solution(12321));
	}
	public static String solution(int num) {
	      if(num % 2 == 0) return "Even";
	      return "Odd";
	  }
}
