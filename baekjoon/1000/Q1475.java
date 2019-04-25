import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        // 초기 세트
        int[] check = new int[10];
        for(int i = 0; i < 10; i++){
            check[i] = 1;
        }

        for(int i = 0; i < n.length(); i++){
            int now = Integer.parseInt(Character.toString(n.charAt(i)));
            if(check[now] > 0) {
                check[now]--;
            } else {
                if(now == 6){
                    if(check[9] > 0) {
                        check[9]--;
                    } else {
                        for(int j = 0; j < 10; j++){
                            check[j]++;
                        }
                        check[now]--;
                    }
                } else if(now == 9){
                    if(check[6] > 0) {
                        check[6]--;
                    } else {
                        for(int j = 0; j < 10; j++){
                            check[j]++;
                        }
                        check[now]--;
                    }
                } else {
                    for(int j = 0; j < 10; j++){
                        check[j]++;
                    }
                    check[now]--;
                }
            }
        }

        int result = -1;
        for(int i = 0; i < 10; i++){
            if(result < check[i]) result = check[i];
        }
        System.out.println(result);
    }
}
