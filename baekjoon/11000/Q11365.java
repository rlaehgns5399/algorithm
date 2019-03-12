import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            String line = sc.nextLine();
            if(line.equals("END")) break;
            for(int i = line.length()-1; i >= 0; i--){
                System.out.print(line.charAt(i));
            }
            System.out.println();
        }
    }
}
