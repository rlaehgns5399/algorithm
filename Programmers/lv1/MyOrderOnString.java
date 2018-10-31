package Programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* https://programmers.co.kr/learn/courses/30/lessons/12915
 * Input: [sun, bed, car], 1
 * Output: [car, bed, sun]
 */
public class MyOrderOnString {

	public static void main(String[] args) {
		String[] s = {"sun", "bed", "car"};
		System.out.println(Arrays.toString(solution(s, 1)));
	}
	public static String[] solution(String[] strings, int n) {
	      String[] answer = new String[strings.length];
	      List<String> list = new ArrayList<String>();
	      for(int i = 0; i < strings.length; i++) list.add(strings[i]);
	      
	      Collections.sort(list, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(n) > o2.charAt(n)){
					return 1;
				} else if(o1.charAt(n) < o2.charAt(n)){
					return -1;
				} else {
					if(o1.compareTo(o2) > 0){
						return 1;
					} else {
						return -1;
					}
				}
			}
	    	  
	      });
	      for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
	      return answer;
	  }
}
