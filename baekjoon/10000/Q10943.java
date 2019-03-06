import java.util.Random;

public class Main {
    public static void main(String args[]){
        Random sc = new Random();
        System.out.println((sc.nextInt() % 10) + 1);
    }
}
