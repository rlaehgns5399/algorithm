
package Programmers.lv1;

import java.util.Arrays;

public class GymSuit {
	public static void main(String[] args) {
		int[] lost = {2,3,4};
		int[] reserve = {1,5};
		System.out.println(solution(5, lost, reserve));
	}
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){ arr[i] = 1; }
        for(int i = 0; i < lost.length; i++) lost[i] = lost[i]-1;
        for(int i = 0; i < reserve.length; i++) reserve[i] = reserve[i]-1;
        
        for(int i = 0; i < lost.length; i++) arr[lost[i]] = 0;
        
        for(int i = 0; i < reserve.length; i++){
            if(arr[reserve[i]] == 0){
                arr[reserve[i]] = 1;
                reserve[i] = 0;
            } else {
            	arr = max(arr, i-1, i+1);
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] == 1) answer++;
        }
        System.out.println(Arrays.toString(arr));
        return answer;
    }
	public static int[] max(int[] arr, int i, int j){
		if(i >= 0 && arr[i] == 0){
			arr[i] = 1;
		} else if( j < arr.length && arr[j] == 0){
			arr[j] = 1;
		}
		return arr;
	}
}
