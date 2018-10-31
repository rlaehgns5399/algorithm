package Programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class IncompletionMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < participant.length; i++){
        	if(map.get(participant[i]) == null){
        		map.put(participant[i], 1);
        	} else {
        		map.put(participant[i], map.get(participant[i]) + 1);
        	}
        }
        
        for(int i = 0; i < completion.length; i++){
        	map.put(completion[i], map.get(completion[i]) - 1);
        }
        for(String key : map.keySet()){
        	if(map.get(key) == 1){
        		return key;
        	}
        }
        return answer;
    }
}
