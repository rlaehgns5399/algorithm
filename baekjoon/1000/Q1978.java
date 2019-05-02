import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean[] primeNumber = new boolean[1001];

        for(int i = 2; i <= 1000; i++){
            primeNumber[i] = true;
        }

        for(int i = 2; i <= 1000; i++){
            if(primeNumber[i] == true){
                for(int j = i+i; j <= 1000; j += i){
                    primeNumber[j] = false;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i = 0; i < n; i++) {
            if (primeNumber[sc.nextInt()]) result++;
        }
        System.out.println(result);
        sc.close();
    }
}
