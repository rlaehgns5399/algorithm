import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] check = new boolean[n][n];
        int startR = sc.nextInt();
        int startC = sc.nextInt();
        int destR = sc.nextInt();
        int destC = sc.nextInt();

        int[] dx = {-2, -2, 0, 0, 2, 2};
        int[] dy = {-1, 1, -2, 2, -1, 1};

        Queue<Item> q = new LinkedList<Item>();
        check[startR][startC] = true;
        q.add(new Item(startR, startC, 0));
        while(!q.isEmpty()){
            Item item = q.poll();
            if(item.x == destR && item.y == destC){
                System.out.println(item.n);
                return;
            }
            for(int i = 0; i < 6; i++){
                int x = item.x + dx[i];
                int y = item.y + dy[i];
                if(x >= 0 && x < n && y >= 0 && y < n && !check[x][y]){
                    check[x][y] = true;
                    q.offer(new Item(x, y, item.n+1));
                }
            }
        }
        System.out.println(-1);
    }
    static class Item{
        public int x, y, n;
        public Item(int x, int y, int n){
            this.x = x;
            this.y = y;
            this.n = n;
        }
    }
}
