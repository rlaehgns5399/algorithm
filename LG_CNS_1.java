import java.util.HashMap;

public class LG_CNS_1 {

	public static void main(String[] args) {
		int answer = 0;
		int[] people = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int[] tshirts = {1, 1,3,3,3,3,3,3,3,3, 0, 0, 0, 0};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < tshirts.length; i++){
            if(map.get(tshirts[i]) == null){
                map.put(tshirts[i], 0);
            }
            map.put(tshirts[i], map.get(tshirts[i]) + 1);
        }
        for(int i = 0; i < people.length; i++){
            if(map.get(people[i]) != null && map.get(people[i]) > 0){
            	answer++;
            	map.put(people[i], map.get(people[i]) - 1);
            } else {
            	for(Integer a : map.keySet()){
            		if(map.get(a) > 0 && a > people[i]){
            			answer++;
                    	map.put(a, map.get(a) - 1);
                    	break;
            		}
            	}
            }
        }
        
        for(Integer a : map.keySet()){
        	System.out.println(a + ": " + map.get(a));
        }
        System.out.println(answer);
	}
}
