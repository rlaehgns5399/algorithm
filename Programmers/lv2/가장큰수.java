import java.util.ArrayList;
import java.util.Collections;

/* https://programmers.co.kr/learn/courses/30/lessons/42746
 * Input: [0, 0, 0, 0]
 * Output : 0000
 * --- Description ---
 * 초기엔 O(n^2 + 4n)로 작업하고, 숫자 하나마다 가중치를 주는 방식으로 구현
 * 가중치를 주는 조건은 각 숫자의 가장 큰 자릿수를 일단 구하고, (999)가 있다면 3
 * 나머지 숫자에 대해서 그 숫자의 자릿수와 가장 큰 자릿수를 비교. 작다면 맨 끝의 숫자를 더 첨가하여 가중치를 생성.
 * ex) 21, 212 -> 21(2+1+1), 212(2+1+2) -> 212 21
 * 12, 121 -> 12(1+2+2), 121(1+2+1) -> 121 21
 * 하지만 테스트 케이스 중에 단 1도 통과를 못했음
 * https://programmers.co.kr/learn/questions/3949 를 참고하며 구현하였음..
 * 나머지 통과하신 분들의 구현한 코드를 봤는데 단순 a+b와 b+a로 비교하며 정렬하는 문제...
 */
 
public class 가장큰수 {
	public static void main(String[] args) {
		int[] question = {0, 0, 0, 0};
		System.out.println(solution(question));
	}
	public static String solution(int[] numbers) {
		String answer = "";
		ArrayList<Node> list = new ArrayList<>();
		
		for(int i = 0; i < numbers.length; i++) {
			int temp_value = 0;
			for(int j = 0; j < 4; j++) {
				int now_digits = String.valueOf(numbers[i]).length();
				String inttoString = String.valueOf(numbers[i]);
				
				switch(now_digits) {
				case 1:
					temp_value = Integer.parseInt(String.valueOf(numbers[i]) + String.valueOf(numbers[i]) + String.valueOf(numbers[i]) + String.valueOf(numbers[i]));
					break;
				case 2:
					temp_value = Integer.parseInt(String.valueOf(numbers[i]) + String.valueOf(numbers[i]));
					break;
				case 3:
					temp_value = Integer.parseInt(String.valueOf(numbers[i]) + Character.toString(inttoString.charAt(0)));
					break;
				case 4:
                    temp_value = Integer.parseInt(String.valueOf(numbers[i]));
				}
			}
			list.add(new Node(numbers[i], temp_value));
		}
		
		Collections.sort(list);
		for(Node a : list) {
			System.out.print(a.number + "(" + a.value + ") ");
		}
		for(Node a : list) {
			answer += a.number;
		}
		try {
			return Integer.parseInt(answer) == 0 ? "0" : answer;
		} catch (NumberFormatException e) {
			return answer;
		}
	}
	
	public static class Node implements Comparable<Node>{
		int number;
		int value;
		
		public Node(int number, int value) {
			this.number = number;
			this.value = value;
		}
		@Override
		public int compareTo(Node node) {
			if(this.value < node.value) {
				return 1;
			} else if(this.value == node.value) {
				return 0;	
			} else {
				return -1;
			}
		}
	}
}

