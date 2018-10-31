package Programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* https://programmers.co.kr/learn/courses/30/lessons/12910
 * Input: [5, 9, 7, 10], 5
 * Output: [5, 10]
 */
public class DivisibleNumberInIntegerArray {

	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		System.out.println(Arrays.toString(solution(arr, 5)));
	}
	public static int[] solution(int[] arr, int divisor) {
	      int[] answer = {};
	      List<Integer> list = new ArrayList<Integer>();
	      for(int i = 0; i < arr.length; i++){
	          if(arr[i] % divisor == 0) list.add(arr[i]);
	      }
	      if(list.size() == 0) list.add(-1);

	      Collections.sort(list);
	      answer = new int[list.size()];
	      for(int i = 0; i < list.size(); i++){
	    	  answer[i] = list.get(i);
	      }
	      return answer;
	  }
}
