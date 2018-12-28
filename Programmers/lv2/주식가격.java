import java.util.Arrays;

/* https://programmers.co.kr/learn/courses/30/lessons/42584
 * Input: [498, 501, 470, 489]
 * Output : [2, 1, 1, 0]
 * --- Description ---
 * O(n^2)면 통과할까 고민했찌만 통과
 * i를 잡고, i+1~n까지 뒤져가면서 작아질때 for문 끝
 */
public class 주식가격 {
	public static void main(String[] args) {
		int arr[] = {498, 501, 470, 489};
		System.out.println(Arrays.toString(solution(arr)));
	}
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for(int i = 0; i < prices.length; i++) {
			int now = prices[i];
			for(int j = i+1; j < prices.length; j++) {
				answer[i]++;
				if(now > prices[j]) {
					break;
				}
				
			}
		}
		return answer;
	}
}
