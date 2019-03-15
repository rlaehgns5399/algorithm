import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int chessLength = sc.nextInt();
            boolean[][] chess = new boolean[chessLength][chessLength];
            int nowX = sc.nextInt();
            int nowY = sc.nextInt();
            int goalX = sc.nextInt();
            int goalY = sc.nextInt();

            Queue<Item> q = new LinkedList<Item>();
            q.offer(new Item(nowX, nowY, 0));
            chess[nowX][nowY] = true;
            while(!q.isEmpty()){
                Item item = q.poll();
                if(item.X == goalX && item.Y == goalY){
                    System.out.println(item.step);
                    break;
                } else {
                    if(item.X - 2 >= 0 && item.Y + 1 < chessLength && !chess[item.X-2][item.Y+1]){
                        q.add(new Item(item.X - 2, item.Y + 1, item.step + 1));
                        chess[item.X-2][item.Y+1] = true;
                    }
                    if(item.X - 2 >= 0 && item.Y - 1 >= 0 && !chess[item.X-2][item.Y-1]){
                        q.add(new Item(item.X - 2, item.Y - 1, item.step + 1));
                        chess[item.X-2][item.Y-1] = true;
                    }
                    if(item.X - 1 >= 0 && item.Y + 2 < chessLength && !chess[item.X-1][item.Y+2]){
                        q.add(new Item(item.X - 1, item.Y + 2, item.step + 1));
                        chess[item.X-1][item.Y+2] = true;
                    }
                    if(item.X - 1 >= 0 && item.Y - 2 >= 0 && !chess[item.X-1][item.Y-2]){
                        q.add(new Item(item.X - 1, item.Y - 2, item.step + 1));
                        chess[item.X-1][item.Y-2] = true;
                    }
                    if(item.X + 1 < chessLength && item.Y + 2 < chessLength && !chess[item.X+1][item.Y+2]){
                        q.add(new Item(item.X + 1, item.Y + 2, item.step + 1));
                        chess[item.X+1][item.Y+2] = true;
                    }
                    if(item.X + 1 < chessLength && item.Y - 2 >= 0 && !chess[item.X+1][item.Y-2]){
                        q.add(new Item(item.X + 1, item.Y - 2, item.step + 1));
                        chess[item.X+1][item.Y-2] = true;
                    }
                    if(item.X + 2 < chessLength && item.Y + 1 < chessLength && !chess[item.X+2][item.Y+1]){
                        q.add(new Item(item.X + 2, item.Y + 1, item.step + 1));
                        chess[item.X+2][item.Y+1] = true;
                    }
                    if(item.X + 2 < chessLength && item.Y - 1 >= 0 && !chess[item.X+2][item.Y-1]){
                        q.add(new Item(item.X + 2, item.Y - 1, item.step + 1));
                        chess[item.X+2][item.Y-1] = true;
                    }
                }
            }

        }
    }
}
class Item{
    public int X;
    public int Y;
    public int step;
    public Item(int x, int y, int step){
        this.X = x;
        this.Y = y;
        this.step = step;
    }
}
