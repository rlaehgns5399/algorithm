package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12916
 * Input: pPoooyY
 * Output: true
 */
public class NumberOfPYInString {

	public static void main(String[] args) {
		System.out.println("pPoooyY");
	}
	static boolean solution(String s) {
        s = s.toLowerCase();
        
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'p') p++;
            if(c == 'y') y++;
        }
        if(p == y) return true;
        return false;
    }
}
