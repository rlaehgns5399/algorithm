import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] countingArray = new int[53]; // 0 : " ", 1~26 : 'A' ~ 'Z', 27~52 : 'a' ~ 'z'
        int N = Integer.parseInt(br.readLine());

        String[] numbers = br.readLine().split(" ");
        int[] numbersToIntArray = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) numbersToIntArray[i] = Integer.parseInt(numbers[i]);
        for(int i = 0; i < N; i++){
            int number = numbersToIntArray[i];
            countingArray[number]++;
        }
        String stringForCompare = br.readLine();

        for(int i = 0; i < stringForCompare.length(); i++) {
            if (stringForCompare.charAt(i) == ' ' && countingArray[0] > 0){
                countingArray[0]--;
            } else if(stringForCompare.charAt(i) >= 65 && stringForCompare.charAt(i) <= 90 && countingArray[stringForCompare.charAt(i) - 64] > 0){
                countingArray[stringForCompare.charAt(i) - 64]--;
            } else if(stringForCompare.charAt(i) >= 97 && stringForCompare.charAt(i) <= 122 && countingArray[stringForCompare.charAt(i) - 70] > 0){
                countingArray[stringForCompare.charAt(i) - 70]--;
            } else {
                System.out.println("n");
                return;
            }
        }

        System.out.println("y");

    }
}
