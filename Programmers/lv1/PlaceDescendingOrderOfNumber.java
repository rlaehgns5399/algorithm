package Programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

/* https://programmers.co.kr/learn/courses/30/lessons/12933
 * Input: 118372
 * Output: 873211
 */
public class PlaceDescendingOrderOfNumber {

	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
	public static long solution(long n) {
	      long answer = 0;
		      String len = String.valueOf(n);
		      
		      Integer[] arr = new Integer[len.length()];
		      for(int i = 0; i < len.length(); i++){
		          arr[i] = Integer.parseInt(String.valueOf(len.charAt(i)));
		      }
		      
		      Arrays.sort(arr, Collections.reverseOrder());
		      
		      String temp = "";
		      for(int i = 0; i < arr.length; i++){
		    	 temp = temp + arr[i]; 
		      }
		      
		      answer = Long.parseLong(temp);
		      
		      return answer;
	  }
}
