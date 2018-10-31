package Programmers.lv1;

import java.util.Arrays;

/* https://programmers.co.kr/learn/courses/30/lessons/12950
 * Input: [[1,2],[2,3]], [[3,4],[5,6]]
 * Output: [[4,6],[7,9]]
 */
public class AddMatrix {

	public static void main(String[] args) {
		int[][] a = {{1,2}, {2,3}};
		int[][] b = {{3,4}, {5,6}};
		int[][] result = solution(a, b);
		for(int i = 0; i < result.length; i++){
			System.out.println(Arrays.toString(result[i]));
		}
	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
	      int[][] answer = new int[arr1.length][arr1[0].length];
	      
	      for(int i = 0; i < arr1.length; i++){
	          for(int j = 0; j < arr1[i].length; j++){
	              answer[i][j] = arr1[i][j] + arr2[i][j];
	          }
	      }
	      return answer;
	  }
}
