import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> q = new LinkedList<>();

        int number = sc.nextInt();
        for(int i = 0; i < number; i++){
            String line = sc.next();
            String[] command = line.split(" ");
            if(command[0].equals("push")){
                q.offer(Integer.parseInt(sc.next()));
            } else if(command[0].equals("pop")){
                if(!q.isEmpty()){
                    System.out.println(q.poll());
                } else {
                    System.out.println(-1);
                }
            } else if(command[0].equals("size")){
                System.out.println(q.size());
            } else if(command[0].equals("empty")){
                if(q.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(command[0].equals("front")){
                if(q.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(q.getFirst());
                }
            } else if(command[0].equals("back")){
                if(q.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(q.getLast());
                }
            }
        }
    }
}
