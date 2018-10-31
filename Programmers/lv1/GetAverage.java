package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12944
 * Input: [1, 2, 3, 4]
 * Output: 2.5
 */
public class GetAverage {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(solution(arr));
	}
	  public static double solution(int[] arr) {
	      double answer = 0;
	      for(int i = 0; i < arr.length; i++){
	          answer += arr[i];
	      }
	      return answer / arr.length;
	  }
}
