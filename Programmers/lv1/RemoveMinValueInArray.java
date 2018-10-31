package Programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* https://programmers.co.kr/learn/courses/30/lessons/12935
 * Input: [4, 3, 2, 1]
 * Output: [4, 3, 2]
 * 
 * Input: [10]
 * Output: [-1]
 */
public class RemoveMinValueInArray {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		System.out.println(Arrays.toString(solution(arr)));
	}
	public static int[] solution(int[] arr) {
	      int[] answer = {-1};
	      if(arr.length == 1) return answer;
	      
	      int min = 0;
	      List<Integer> list = new ArrayList<Integer>();
	      
	      for(int i = 0; i < arr.length; i++){
	          if(arr[i] < arr[min]) min = i;
	          list.add(arr[i]);
	      }
	      list.remove(min);
	      
	      answer = list.stream().mapToInt(i->i).toArray();
	      
	      return answer;
	  }
}
