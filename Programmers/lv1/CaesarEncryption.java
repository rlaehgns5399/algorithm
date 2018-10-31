package Programmers.lv1;

/* https://programmers.co.kr/learn/courses/30/lessons/12926
 * Input: "ab", 1
 * Output: "bc"
 */
public class CaesarEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "zy";
		s = Encrypt(s, 2);
		System.out.println(s);
	}
	public static String Encrypt(String s, int n){
		n = n % 26;
        String result = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                result += " ";
            } else if(c >= 'a' && c <= 'z'){
                c = (char) (((c - 97 + n) % 26) + 97);
                result += c;
            } else if(c >= 'A' && c <= 'Z'){
            	c = (char) (((c - 65 + n) % 26) + 65);
            	result += c;
            }
        }
        return result;
    }
}
