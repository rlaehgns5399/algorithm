import java.util.Arrays;

public class naver_Q1 {
    public static void main(String args[]) {
        int[] A = {1, 2, 3, 4, 5, 6};
        System.out.println(Solution(A));
    }
    private static int Solution(int[] A){
        int[] result = new int[6];

        for(int target = 1; target <= 6; target++){
            int count = 0;
            for(int i = 0; i < A.length; i++){
                int nowDice = A[i];
                switch(target){
                    case 1:
                        switch(nowDice){
                            case 1:
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                count += 1;
                                break;
                            case 6:
                                count += 2;
                                break;
                        }
                        break;
                    case 2:
                        switch(nowDice){
                            case 2:
                                break;
                            case 1:
                            case 3:
                            case 4:
                            case 6:
                                count += 1;
                                break;
                            case 5:
                                count += 2;
                                break;
                        }
                        break;
                    case 3:
                        switch(nowDice){
                            case 3:
                                break;
                            case 1:
                            case 2:
                            case 5:
                            case 6:
                                count += 1;
                                break;
                            case 4:
                                count += 2;
                                break;
                        }
                        break;
                    case 4:
                        switch(nowDice){
                            case 4:
                                break;
                            case 1:
                            case 2:
                            case 5:
                            case 6:
                                count += 1;
                                break;
                            case 3:
                                count += 2;
                                break;
                        }
                        break;
                    case 5:
                        switch(nowDice){
                            case 5:
                                break;
                            case 1:
                            case 3:
                            case 4:
                            case 6:
                                count += 1;
                                break;
                            case 2:
                                count += 2;
                                break;
                        }
                        break;
                    case 6:
                        switch(nowDice){
                            case 6:
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                count += 1;
                                break;
                            case 1:
                                count += 2;
                                break;
                        }
                        break;
                }
            }
            result[target-1] = count;
        }

        Arrays.sort(result);
        return result[0];
    }
}
