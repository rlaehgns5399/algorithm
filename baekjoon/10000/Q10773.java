import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < number; i++){
            int p = Integer.parseInt(sc.next());

            if(p == 0){
                stack.pop();
            } else {
                stack.push(p);
            }
        }

        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        System.out.println(result);
    }
}
