import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        line = line.replace("HH", "");
        line = line.replace("VV", "");
        int[][] arr = { {1, 2}, {3, 4} };
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == 'H'){
                int temp = arr[0][0];
                arr[0][0] = arr[1][0];
                arr[1][0] = temp;
                temp = arr[0][1];
                arr[0][1] = arr[1][1];
                arr[1][1] = temp;
            } else {
                int temp = arr[0][0];
                arr[0][0] = arr[0][1];
                arr[0][1] = temp;
                temp = arr[1][0];
                arr[1][0] = arr[1][1];
                arr[1][1] = temp;
            }
        }

        System.out.println(arr[0][0] + " " + arr[0][1] + "\n" + arr[1][0] + " " + arr[1][1]);
    }
}
