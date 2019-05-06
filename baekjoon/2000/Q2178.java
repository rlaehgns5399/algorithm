import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nm = br.readLine();
        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);

        boolean[][] check = new boolean[n][m];
        int[][] path = new int[n][m];
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            for(int j = 0; j < m; j++){
                if(line.charAt(j) == '1'){
                    path[i][j] = 1;
                }
            }
        }

        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};

        Queue<Item> q = new LinkedList<>();
        check[0][0] = true;
        q.offer(new Item(0, 0, 1));
        while(!q.isEmpty()){
            Item item = q.poll();
            if(item.x == n-1 && item.y == m-1) {
                System.out.println(item.i);
                return;
            }
            for(int i = 0; i < 4; i++){
                int x = item.x + dx[i];
                int y = item.y + dy[i];
                if(x >= 0 && x < n && y >= 0 && y < m && path[x][y] == 1 && !check[x][y]){
                    q.offer(new Item(x, y, item.i + 1));
                    check[x][y] = true;
                }
            }

        }
    }
    static class Item{
        int x, y, i;
        public Item(int x, int y, int i){
            this.x = x;
            this.y = y;
            this.i = i;
        }
    }
}
