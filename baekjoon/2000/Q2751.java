import java.util.Collections;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> list = new LinkedList<Integer>();
        
        int number = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < number; i++)
            list.add(Integer.parseInt(br.readLine()));

        StringBuffer sb = new StringBuffer();
        Collections.sort(list);

        for(int i : list){
            sb.append(i);
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
