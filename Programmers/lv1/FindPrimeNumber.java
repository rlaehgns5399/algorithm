package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12921
 * Input: 10
 * Output: 4
 */
public class FindPrimeNumber {

	public static void main(String[] args) {
		System.out.println(solution(20));

	}
	public static int solution(int n) {
	      int answer = 0;
	      if(n <= 1) return 0;
	      boolean[] arr = new boolean[n+1];
	      arr[0] = false;
	      arr[1] = false;
	      for(int i = 2; i < arr.length; i++) arr[i] = true;

	      for(int i = 2; (i*i) <= n; i++){
	          if(arr[i] == true){
	              for(int j = i*i; j <= n; j += i) arr[j] = false;
	          }
	      }

	      for(int i = 0; i < arr.length; i++){
	          if(arr[i] == true) answer++;
	      }

	      return answer;
	  }
}
