package Programmers.lv1;

import java.util.Arrays;

/* https://programmers.co.kr/learn/courses/30/lessons/12932
 * Input: 12345
 * Output: [5, 4, 3, 2, 1]
 */
public class MakeReverseOrderArrayInNumber {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(123123)));
	}
	public static int[] solution(long n) {
	      String str = String.valueOf(n);
	      
	      int counter = str.length()-1;
	      int[] answer = new int[str.length()];
	      
	      for(int i = (int)Math.pow(10, str.length() - 1); i > 0; i /= 10){
	          answer[counter--] = (int)(n / i);
	          n = n % i;
	      }
	      return answer;
	  }
}
