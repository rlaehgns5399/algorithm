import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by KimDoHoon on 2019-04-12 012.
 */
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] dx = {1, -1, 0 ,0};
        int[] dy = {0, 0, -1, 1};

        boolean[][] check = new boolean[m][n];
        int[][] map = new int[m][n];

        Queue<Item> q = new LinkedList<>();

        int lamb = 0;
        int wolf = 0;

        for(int i = 0; i < m; i++){
            String s = sc.next();
            for(int j = 0; j < n; j++){
                if(s.charAt(j) == '.'){

                } else if(s.charAt(j) == '#'){
                    check[i][j] = true;
                } else if(s.charAt(j) == 'o'){
                    // o : 양
                    q.offer(new Item(i, j));
                    lamb++;
                    map[i][j] = 1;
                } else if(s.charAt(j) == 'v'){
                    // v : 늑대
                    q.offer(new Item(i, j));
                    wolf++;
                    map[i][j] = 2;
                }
            }
        }

        while(!q.isEmpty()){
            Item item = q.poll();
            // System.out.println(item.x + ", " + item.y);
            if(check[item.x][item.y]) continue;
            Queue<Item> tempQ = new LinkedList<Item>();
            tempQ.offer(item);

            int tempWolf = 0;
            int tempLamb = 0;
            while(!tempQ.isEmpty()){
                Item tempItem = tempQ.poll();
                // System.out.println("[x]" + tempItem.x + " " + tempItem.y);
                if(check[tempItem.x][tempItem.y]) continue;
                check[tempItem.x][tempItem.y] = true;
                if(map[tempItem.x][tempItem.y] == 1){
                    tempLamb++;
                } else if(map[tempItem.x][tempItem.y] == 2) {
                    tempWolf++;
                }

                for(int i = 0; i < 4; i++){
                    int x = tempItem.x + dx[i];
                    int y = tempItem.y + dy[i];
                    if(x >= 0 && x < m && y >= 0 && y < n && !check[x][y]){
                        tempQ.offer(new Item(x, y));
                    }
                }
            }
            if(tempLamb > tempWolf){
                wolf -= tempWolf;
            } else {
                lamb -= tempLamb;
            }
        }

        System.out.println(lamb + " " + wolf);
    }
    static class Item{
        public int x;
        public int y;
        public Item(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
