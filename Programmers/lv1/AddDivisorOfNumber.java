package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12928
 * Input: 12
 * Return: 28
 * 
 * Input: 5
 * Return: 6
 */
public class AddDivisorOfNumber {

	public static void main(String[] args) {
		System.out.println(solution(123123));
	}
	 public static int solution(int n) {
	      int answer = 0;
	        for(int i = 1; i <= n; i++){
	            if(n % i == 0) answer += i;
	        }
	        return answer;
	  }
}
