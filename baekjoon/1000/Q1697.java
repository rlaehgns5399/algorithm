import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[100001];

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer[]> q = new LinkedList<Integer[]>();

        q.offer(new Integer[]{n, 0});
        check[n] = true;

        int result = 0;
        while(!q.isEmpty()){
            Integer[] item = q.poll();

            if(item[0] == k) {
                System.out.println(item[1]);
                break;
            }

            if(item[0]-1 >= 0 && !check[item[0]-1]) {
                q.offer(new Integer[]{item[0]-1, item[1]+1});
                check[item[0]-1] = true;
            }
            if(item[0]+1 <= 100000 && !check[item[0]+1]) {
                q.offer(new Integer[]{item[0]+1, item[1]+1});
                check[item[0]+1] = true;
            }
            if(item[0]*2 <= 100000 && !check[item[0]*2]) {
                q.offer(new Integer[]{item[0]*2, item[1]+1});
                check[item[0]*2] = true;
            }
        }
        sc.close();
        q = null;
    }
}
