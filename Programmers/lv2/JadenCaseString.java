package Programmers.lv2;

import java.util.Arrays;

public class JadenCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("6개를 판매할 수 없습니다!");
		//solution("for the     last  week");
	}
	public static String solution(String s) {
		String result = "";
		s = s.replace(" ", "#"); 
	    String[] temp = s.split("#"); 

			System.out.println(Arrays.toString(temp));
	      for(int i = 0; i < temp.length; i++){
	          temp[i] = temp[i].toLowerCase();
	          Character a = Character.toUpperCase(temp[i].charAt(0));
	          temp[i] = a.toString() + temp[i].substring(1, temp[i].length());
	          if(i != temp.length-1){
	        	  result += temp[i] + " ";
	          } else {
	        	  result += temp[i];
	          }
	      }
	      return result;
	  }
}
