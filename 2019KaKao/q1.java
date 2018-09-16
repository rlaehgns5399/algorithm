import java.util.HashMap;

public class q1 {
	
	public String[] solution(String[] record){
		String[] answer = {};
		HashMap<String, String> map = new HashMap<String, String>();
		
		int size = 0;
		
		for(int i = 0; i <record.length; i++){
			String[] split = record[i].split(" ");
			if(split[0].equals("Enter")){
				map.put(split[1], split[2]);
				size++;
			} else if(split[0].equals("Change")){
				map.put(split[1], split[2]);
			} else {
				size++;
			}
		}
		
		answer = new String[size];
		int pointer = 0;
		for(int i = 0; i < record.length; i++){
			String result = "";
		
			String[] split = record[i].split(" ");
			if(split[0].equals("Enter")){
				result = map.get(split[1]) + "님이 들어왔습니다.";
				answer[pointer++] = result;
			} else if(split[0].equals("Leave")){
				result = map.get(split[1]) + "님이 나갔습니다.";
				answer[pointer++] = result;
			} else {
				continue;
			}
		}
		
		return answer;
	}
}

