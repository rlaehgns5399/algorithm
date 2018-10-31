package Programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* https://programmers.co.kr/learn/courses/30/lessons/12917
 * Input: Zbcdefg
 * Output: gfedcbZ
 */
public class PlaceDescendingOrderOfString {

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
	public static String solution(String s){
		char[] a = s.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for(int i = 0; i < a.length; i++) list.add(a[i]);
		Collections.sort(list, Collections.reverseOrder());
		return list.stream().map(e -> e.toString()).reduce((acc, e) -> acc + e).get();
	}
}
