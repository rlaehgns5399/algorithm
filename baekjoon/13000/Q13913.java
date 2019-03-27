import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] check = new int[100001];

        for(int i = 0; i <= 100000; i++) check[i] = -2;

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer[]> q = new LinkedList<Integer[]>();
        LinkedList<Integer> list = new LinkedList<>();

        q.offer(new Integer[]{n, 0});
        check[n] = -1;

        while(!q.isEmpty()){
            Integer[] item = q.poll();

            if(item[0] == k) {
                System.out.println(item[1]);
                int t = item[0];
                while(check[t] != -1){
                    list.add(t);
                    t = check[t];
                }
                list.add(n);

                Collections.reverse(list);
                for(Integer a : list) System.out.print(a + " ");
            }

            if(item[0]-1 >= 0 && check[item[0]-1] == -2) {
                q.offer(new Integer[]{item[0]-1, item[1]+1});
                check[item[0]-1] = item[0];
            }
            if(item[0]+1 <= 100000 && check[item[0]+1] == -2) {
                q.offer(new Integer[]{item[0]+1, item[1]+1});
                check[item[0]+1] = item[0];
            }
            if(item[0]*2 <= 100000 && check[item[0]*2] == -2) {
                q.offer(new Integer[]{item[0]*2, item[1]+1});
                check[item[0]*2] = item[0];
            }
        }
        sc.close();
        q = null;
    }
}
