import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("-");
        for(int i = 0; i < s.length; i++){
            System.out.print(s[i].charAt(0));
        }
        sc.close();
    }
}
