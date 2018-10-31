package Programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* https://programmers.co.kr/learn/courses/30/lessons/12906
 * Input: [1,1,3,3,0,1,1]
 * Output: [1,3,0,1]
 */
public class NoMoreDuplicatedNumberInArray {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		System.out.println(Arrays.toString(solution(arr)));
	}
	public static int[] solution(int []arr) {
        int[] answer = {};
            
        List<Integer> list = new ArrayList<Integer>();
        int remember = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != remember) {
                list.add(arr[i]);
                remember = arr[i];
            }
        }
                               
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
	}

}
