import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KaKaoCoding_1_2 {
	public KaKaoCoding_1_2(String str){
		String pattern_str = "([0-9]?[10]?[SDT]?[*#]?)";
		Pattern pattern = Pattern.compile(pattern_str);
		Matcher matcher = pattern.matcher(str);
		
		List<String> list = new ArrayList<String>();
		while(matcher.find()){
			
			String temp = matcher.group(1);
			if(temp.length() > 0){
				list.add(temp);
			}
		}
		
		int result = 0;
		int[] score_board = new int[3];
		for(int i = 0; i < list.size(); i++){
			String item = list.get(i);
			int local_score; 
			
			int score = Character.getNumericValue(item.charAt(0));
			if(item.contains("10")){
				score = 10;
			}
			int pow = 0;
			if(item.contains("S")){
				pow = 1;
			} else if(item.contains("D")){
				pow = 2;
			} else if(item.contains("T")){
				pow = 3;
			}
			
			local_score = (int)Math.pow(score, pow);
			
			if(item.contains("#")){
				local_score = -local_score;
			} else if(item.contains("*")){
				if(i >= 1){
					score_board[i-1] *= 2;
				}
				local_score *= 2;
			}
			//System.out.println(local_score);
			
			score_board[i] = local_score;
		}
		
		for(int i = 0; i < 3; i++){
			result += score_board[i];
		}
		
		System.out.println(result);
	}
}
