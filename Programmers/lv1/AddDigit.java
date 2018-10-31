package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12931
 * Input: 123
 * Ouput: 6
 * 
 * Input: 987
 * Output: 24
 */
public class AddDigit {

	public static void main(String[] args) {
		System.out.println(solution(123123));
	}
	public static int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n);
	      
	    for(int i = 0; i < str.length(); i++){
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return answer;
    }
}
