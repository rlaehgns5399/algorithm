package Programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;

/* https://programmers.co.kr/learn/courses/30/lessons/42586
 * Input: [93, 30, 55]
 * Output : [1, 30, 5]
 */

public class 기능개발 {

	public static void main(String[] args) {
		int a[] = {93, 30, 55};
		int b[] = {1, 30, 5};
		System.out.println(Arrays.toString(solution(a, b)));
	}
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[100];
        ArrayList<Integer> p = new ArrayList<Integer>();
        ArrayList<Integer> s = new ArrayList<Integer>();
        for(int i = 0; i < progresses.length; i++){
        	p.add(progresses[i]);
        	s.add(speeds[i]);
        }
        
        int day = 0;
        while(!p.isEmpty()){
        	if(p.get(0) < 100){
        		for(int i = 0; i < p.size(); i++){
        			p.set(i, p.get(i) + s.get(i));
        		}
        		day++;
        	} else {
        		p.remove(0);
        		s.remove(0);
        		answer[day]++;
        	}
        }
        
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < answer.length; i++){
        	if(answer[i] != 0) a.add(answer[i]);
        }
        
        int[] real_answer = a.stream().mapToInt(i -> i).toArray();
        return real_answer;
    }
}
