import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<Integer>();
        
        int number = sc.nextInt();
        
        for(int i = 0; i < number; i++)
            list.add(sc.nextInt());

        Collections.sort(list);

        for(int i : list){
            System.out.println(i);
        }
    }
}
