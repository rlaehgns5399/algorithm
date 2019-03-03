import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int number = sc.nextInt();
        for(int i = 0; i < number; i++){
            String line = sc.next();
            String[] command = line.split(" ");
            if(command[0].equals("push")){
                stack.push(Integer.parseInt(sc.next()));
            } else if(command[0].equals("pop")){
                if(!stack.isEmpty()){
                    System.out.println(stack.pop());
                } else {
                    System.out.println(-1);
                }
            } else if(command[0].equals("size")){
                    System.out.println(stack.size());
            } else if(command[0].equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(command[0].equals("top")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
