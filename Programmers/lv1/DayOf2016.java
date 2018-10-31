package Programmers.lv1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* https://programmers.co.kr/learn/courses/30/lessons/12901
 * Input: 5, 24
 * Output: TUE
 */
public class DayOf2016 {

	public static void main(String[] args) {
		System.out.println(solution(5, 24));
	}
	public static String solution(int a, int b) {
	      String answer = "";
	      try{
	    	  String temp_month = String.valueOf(a);
	    	  String temp_day = String.valueOf(b);
		      SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyyMMdd");
		      if(a < 10) temp_month = "0" + temp_month;
		      if(a < 10) temp_day = "0" + temp_day;
		      Date date = dateFormat.parse("2016" + temp_month + temp_day);
		      
		      Calendar cal = Calendar.getInstance();
		      cal.setTime(date);
		      int dayNum = cal.get(Calendar.DAY_OF_WEEK);
		      switch(dayNum){
		      case 1:
		    	  answer = "SUN";
		    	  break;
		      case 2:
		    	  answer = "MON";
		    	  break;
		      case 3:
		    	  answer = "TUE";
		    	  break;
		      case 4:
		    	  answer = "WED";
		    	  break;
		      case 5: 
		    	  answer = "THU";
		    	  break;
		      case 6:
		    	  answer = "FRI";
		    	  break;
		      case 7:
		    	  answer = "SAT";
		    	  break;
		      }
	      } catch (Exception e){
	    	  
	      }
	      return answer;
	  }
}
