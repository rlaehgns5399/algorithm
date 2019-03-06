import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int E = 1;
        int S = 1;
        int M = 1;

        int yE = sc.nextInt();
        int yS = sc.nextInt();
        int yM = sc.nextInt();

        int year = 1;
        if(yE + yS + yM == 3){
            System.out.println(year);
            return;
        }
        while(true){
            year++;
            E = (E % 15) + 1;
            S = (S % 28) + 1;
            M = (M % 19) + 1;

            if((E == yE) && (S == yS) && (M == yM)) break;
        }
        System.out.println(year);
    }
}
