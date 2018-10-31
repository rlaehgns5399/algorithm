package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12934
 * Input: 121
 * Return: 144(11+1^2)
 * 
 * Input: 3
 * Return: -1
 */
public class DetectRoot {

	public static void main(String[] args) {
		System.out.println(solution(123123));
	}
	public static long solution(long n) {
	      long answer = 0;
	      double a = Math.sqrt((double)n);
	      int b = (int) a;
	      
	      if(a - b > 0.0000000001){	// Precision
	          return -1;
	      }
	      answer = (long)Math.pow((double)((int) a)+1,2);
	      return answer;
	  }
}
