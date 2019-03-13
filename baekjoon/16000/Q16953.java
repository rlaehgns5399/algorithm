import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int dest = sc.nextInt();

        HashMap<Integer, LinkedList<Integer>> dp = new HashMap<Integer, LinkedList<Integer>>();
        for(int i = 1; i <= 32; i++){
            dp.put(i, new LinkedList<Integer>());
        }

        dp.get(1).add(start);
        boolean flag = false;
        int result = -1;
        for(int i = 2; i <= 32; i++){
            for(int a : dp.get(i-1)){
                if(a == dest){
                    flag = true;
                    result = i;
                    break;
                }
                try{
                    dp.get(i).add(a * 2);
                } catch (Exception e){
                    continue;
                }
                try{
                    dp.get(i).add(Integer.parseInt(a + "1"));
                } catch (Exception e){
                    continue;
                }
            }
            if(flag) break;
        }
        if(result != -1) {
            System.out.print(result - 1);
        } else {
            System.out.print(result);
        }
        sc.close();
    }
}
