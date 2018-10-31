package Programmers.lv1;

import java.util.Arrays;

/* https://programmers.co.kr/learn/courses/30/lessons/12940
 * Input: 3, 12
 * Output: [3, 12]
 * 
 * Input: 2, 5
 * Output: [1, 10]
 * 
 * Using Euclidean algorithm
 */
public class GCDandLSM {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2, 5)));
	}
	public static int[] solution(int n, int m) {
	      int[] answer = new int[2];
	      
	      int a = n;
	      int b = m;
	      int mod = a % b;
	      while(mod > 0){
	          a = b;
	          b = mod;
	          mod = a % b;
	      }
	      
	      answer[0] = b;
	      answer[1] = n * m / b; 
	      
	      return answer;
	  }
}
