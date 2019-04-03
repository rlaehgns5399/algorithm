public class Main {
    public static void main(String args[]){
        System.out.println("n e\n" +
                "- -----------");
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
            getE(i);
        }
    }
    public static void getE(int n){
        if(n == 0) {
            System.out.println(1);
            return;
        }
        if(n == 1) {
            System.out.println(2);
            return;
        }
        if(n == 2) {
            System.out.println(2.5);
            return;
        }
        double sum = 0;
        for(int i = 0; i <= n; i++){
            sum += (double)1 / (double)factorial(i);
        }
        System.out.printf("%.9f\n", sum);
    }
    public static int factorial(int n){
        if ( n <= 0) return 1;
        return n * factorial(n-1);
    }

}
