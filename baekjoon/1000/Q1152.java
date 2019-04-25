import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] split = line.split(" ", -1);

        int result = 0;
        for(int i = 0; i < split.length; i++){
        if(split[i].equals("")) continue;
        result++;
    }
        System.out.println(result);
}
}
