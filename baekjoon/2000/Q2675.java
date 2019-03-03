import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 0; i < number; i++){
            int iterator =  Integer.parseInt(sc.next());
            String text = sc.next();

            for(int j = 0; j < text.length(); j++){
                for(int k = 0; k < iterator; k++){
                    System.out.print(text.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
