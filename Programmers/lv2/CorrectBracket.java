package Programmers.lv2;

import java.util.Stack;

public class CorrectBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean solution(String s) {
        
        Stack<String> stack = new Stack();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push("(");
            } else {
                if(stack.isEmpty()){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        if(stack.size() == 0) return true;
        return false;
    }
}
