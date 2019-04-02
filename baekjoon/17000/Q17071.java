import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int subin = sc.nextInt();
        int brother = sc.nextInt();

        boolean[][] bfs = new boolean[2][500001];
        Queue<Integer> q = new LinkedList<>();

        int turn = 1;
        q.offer(subin);
        bfs[0][subin] = true;

        if(subin == brother){
            System.out.println(0);
            return;
        }
        while(!q.isEmpty()){
            brother += turn;
            if(brother > 500000) {
                System.out.println("-1");
                return;
            }
            if(bfs[turn % 2][brother]){
                System.out.println(turn);
                return;
            }
            int size = q.size();
            for(int i = 0; i < size; i++){
                int temp = q.poll();
                if(temp+1 == brother || temp-1 == brother || temp*2 == brother){
                    System.out.println(turn);
                    return;
                }
                else {
                    if(temp + 1 <= 500000 && !bfs[turn % 2][temp + 1]){
                       q.offer(temp+1);
                       bfs[turn % 2][temp+1] = true;
                    }
                    if(temp - 1 >= 0 && !bfs[turn % 2][temp - 1]){
                        q.offer(temp - 1);
                        bfs[turn % 2][temp - 1] = true;
                    }
                    if(temp * 2 <= 500000 && !bfs[turn % 2][temp * 2]){
                        q.offer(temp*2);
                        bfs[turn % 2][temp*2] = true;
                    }
                }
            }
            turn++;
        }
        System.out.println(-1);
    }

}
