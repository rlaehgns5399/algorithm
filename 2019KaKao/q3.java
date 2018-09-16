import java.util.HashMap;
import java.util.Stack;

public class q3 {
	public static void main(String args[]){
		String[][] a = {{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "2"}, {"300", "tube", "computer", "3"}, {"400", "con", "computer", "4"}, {"500", "muzi", "music", "3"}, {"600", "apeach", "music", "2"}};
		System.out.println(solution(a));
	}
	public static int solution(String[][] relation){
		int answer = 0;
		// relation[0].length == 가로
		// relation.length == 세로
		for(int i = 0; i < relation[0].length; i++){
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(i);
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for(int j = 0; j < relation.length; j++){
				/// todo map.put(relation[j][j], value);
			}
		}
		
		return answer;
	}
}
