package Programmers.lv1;

import java.util.Arrays;

/* https://programmers.co.kr/learn/courses/30/lessons/12954
 * Input: x=2, n=5
 * Output: [2, 4, 6, 8, 10]
 * 
 * Input: x=-4, n=2
 * Output: [-4, -8]
 */
public class nNumArrayWithXInterval {
	public static void main(String[] args){
		long[] a = solution(2, 5);
		System.out.println(Arrays.toString(a));
	}
	public static long[] solution(int x, int n) {
	      long[] answer = new long[n];
	      
	      answer[0] = x;
	      for(int i = 1; i < n; i++){
	          answer[i] = x + answer[i-1];
	      }
	      return answer;
	  }
}
