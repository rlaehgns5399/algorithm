package Programmers.lv2;

import java.util.HashMap;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 * Input: [119, 97674223, 1195524421]
 * Output: false
 */
public class ContactList {

	public static void main(String[] args) {
		
	}
	public static boolean solution(String[] phone_book){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < phone_book.length; i++){
			map.put(phone_book[i].replace(" ", ""), 1);
		}
		
		for(int i = 0; i < phone_book.length; i++){
			String now = phone_book[i].replace(" ", "");
			for(String a : map.keySet()){
				if(a.startsWith(now) && !a.equals(now)) return false;
			}
		}
		return true;
	}

}
