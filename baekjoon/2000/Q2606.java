import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int edge = sc.nextInt();

        boolean[] check = new boolean[n+1];

        int[][] arr = new int[n+1][n+1];
        for(int i = 0; i < edge; i++){
            int start = sc.nextInt();
            int dest = sc.nextInt();
            arr[start][dest] = arr[dest][start] = 1;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        check[1] = true;

        int count = 0;
        while(!stack.isEmpty()){
            int peek = stack.peek();

            boolean flag = false;
            for(int i = 1; i <= n; i++){
                if(arr[peek][i] == 1 && check[i] == false){
                    check[i] = true;
                    stack.push(i);
                    flag = true;
                    count++;
                    break;
                }
            }
            if(!flag) stack.pop();
        }
        System.out.println(count);
    }
}
