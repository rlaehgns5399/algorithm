import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        while(sc.hasNext()) list.add(sc.nextInt());
        
        Collections.sort(list);
        
        System.out.println(list.get(1));
    }
}
