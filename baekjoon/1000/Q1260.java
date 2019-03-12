import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int vertexN = sc.nextInt();
        int edgeN = sc.nextInt();
        int startN = sc.nextInt();

        int[][] graph = new int[vertexN+1][vertexN+1];
        boolean[] check = new boolean[vertexN+1];

        for(int i = 0; i < edgeN; i++){
            int start = sc.nextInt();
            int dest = sc.nextInt();
            graph[start][dest] = graph[dest][start] = 1;
        }

        check[startN] = true;
        System.out.print(startN + " ");
        Stack<Integer> stack = new Stack<>();
        stack.push(startN);

        while(!stack.empty()){
            int now = stack.peek();
            boolean flag = false;
            for(int i = 1; i <= vertexN; i++){
                if(graph[now][i] == 1 && check[i] == false){
                    stack.push(i);
                    System.out.print(i + " ");
                    check[i] = true;
                    flag = true;
                    break;
                }
            }
            if(flag == false) stack.pop();
        }

        System.out.println();

        for(int i = 0; i < check.length; i++) check[i] = false;

        Queue<Integer> q = new LinkedList<>();
        q.add(startN);
        check[startN] = true;

        while(!q.isEmpty()){
            int now = q.poll();
            System.out.print(now + " ");
            for(int i = 1; i <= vertexN; i++){
                if(graph[now][i] == 1 && check[i] == false){
                    check[i] = true;
                    q.add(i);
                }
            }
        }

    }
}
