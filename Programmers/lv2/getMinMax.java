package Programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;

/* https://programmers.co.kr/learn/courses/30/lessons/12939
 * Input: [1, 2, 3, 4]
 * Output: [1, 4]
 */
public class getMinMax {
	public static void main(String[] args){
		System.out.println(solution("1 2 3 4"));
	}
	public static String solution(String s) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    String result = "";
	    String[] a = s.split(" ");
	    for(int i = 0; i < a.length; i++){
	        list.add(Integer.parseInt(a[i]));
	    }
	    Collections.sort(list);
	    result += list.get(0);
	    result += " " + list.get(list.size()-1);
	    return result;
	}
}
