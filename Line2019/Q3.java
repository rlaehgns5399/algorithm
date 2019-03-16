import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by KimDoHoon on 2019-03-16 016.
 */
public class Q3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        SortedMap<Integer, LinkedList<String>> map = new TreeMap<>();
        int h = Integer.parseInt(br.readLine());
        String[] name = br.readLine().split(" ");
        LinkedList<String> category = new LinkedList<>();
        for(int i = 0; i < name.length; i++)
            category.add(name[i]);

        for(int q = 0; q < h-1; q++){
            String[] item = br.readLine().split(" ");
            LinkedList<String> list = new LinkedList<>();
            for(int i = 1; i < item.length; i++){
                list.add(item[i]);
            }
            map.put(Integer.parseInt(item[0]), list);
        }

        int h1 = Integer.parseInt(br.readLine());
        String[] name1 = br.readLine().split(" ");
        LinkedList<String> category1 = new LinkedList<String>();
        for(int i = 1; i < name1.length; i++)
            category.add(name1[i]);

        for(int q = 0; q < h1-1; q++){
            String[] item = br.readLine().split(" ");
            LinkedList<String> list = new LinkedList<>();
            for(int i = 1; i < item.length; i++){
                if(map.get(Integer.parseInt(item[0])) == null) continue;
                map.get(Integer.parseInt(item[0])).add(item[i]);
            }
        }

        for(String a : category){
            System.out.print(a + " ");
        }
        System.out.println();

        for(int i : map.keySet()){
            System.out.print(i + " ");
            for(String k : map.get(i)){
                System.out.print(k + " ");
            }

            for(int d = 0; d < category.size() - map.get(i).size() - 1; d++){
                System.out.print("NULL" + " ");
            }
            System.out.println();
        }




    }
}
