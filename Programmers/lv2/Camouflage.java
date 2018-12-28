import java.util.HashMap;

/* https://programmers.co.kr/learn/courses/30/lessons/42578
 * Input: [{"yellow_hat", "headgear"},
				{"blue_sunglasses", "eyewear"},
				{"green_turban", "headgear"}]
 * Output : 5
 * --- Description ---
 * Category A: 3개의 아이템,
 * Category B: 2개의 아이템이 있다고 가정하면,
 * A : a b c (X: 안뽑는 경우) : 4
 * B : 0 1 (X: 안뽑는 경우) : 3
 * 각각은 독립 적이므로, n(A)*n(B)-1(최소한 한 개의 옷을 입는다고 가정하므로 하나도 안입는 경우 제외)
 */
public class Camouflage {

	public static void main(String[] args) {
		String[][] clothes = {
				{"yellow_hat", "headgear"},
				{"blue_sunglasses", "eyewear"},
				{"green_turban", "headgear"}
		};
		System.out.println(solution(clothes));
	}
	public static int solution(String[][] clothes) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < clothes.length; i++) {
			if(map.get(clothes[i][1]) == null) {
				map.put(clothes[i][1], 1);
			} else {
				map.put(clothes[i][1], map.get(clothes[i][1])+1);
			}
		}
		
		int answer = 1;
		for(String key : map.keySet()) {
			answer *= (map.get(key)+1);
		}
		return --answer;
	}
}
