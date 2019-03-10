import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        for(int i = (int)'a'; i <= (int)'z'; i++){
            int check = -1;
            for(int n = 0; n < line.length(); n++) {
                if(line.charAt(n) == (char)i){
                    check = n;
                    break;
                }
            }
            System.out.print(check + " ");
        }
    }
}
