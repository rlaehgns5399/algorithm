/* https://programmers.co.kr/learn/courses/30/lessons/12899
 * Input: 10
 * Output : 41
 * --- Description ---
 * n = (n - 1) / 3 이 핵심
 */
public class _124나라의숫자 {

	public static void main(String[] args) {
		System.out.println(solution(333));
	}

	public static String solution(int n) {
		String answer = "";
		String marks = "412";
		while (n > 0) {
			answer = Character.toString(marks.charAt(n % 3)) + answer;
			n = (n - 1) / 3;
		}
		return answer;
	}
}
