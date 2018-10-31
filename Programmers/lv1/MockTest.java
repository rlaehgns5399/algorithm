package Programmers.lv1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MockTest {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		System.out.println(Arrays.toString(solution(answers)));
	}
	public static int[] solution(int[] answers) {
		Queue<Integer> queue_a = new LinkedList<Integer>();
		Queue<Integer> queue_b = new LinkedList<Integer>();
		Queue<Integer> queue_c = new LinkedList<Integer>();
		
		queue_a.offer(1);
		queue_a.offer(2);
		queue_a.offer(3);
		queue_a.offer(4);
		queue_a.offer(5);
		
		queue_b.offer(2);
		queue_b.offer(1);
		queue_b.offer(2);
		queue_b.offer(3);
		queue_b.offer(2);
		queue_b.offer(4);
		queue_b.offer(2);
		queue_b.offer(5);
		
		queue_c.offer(3);
		queue_c.offer(3);
		queue_c.offer(1);
		queue_c.offer(1);
		queue_c.offer(2);
		queue_c.offer(2);
		queue_c.offer(4);
		queue_c.offer(4);
		queue_c.offer(5);
		queue_c.offer(5);
		
		int[] temp = new int[3];
		for(int i = 0; i < temp.length; i++) temp[i] = 0;
		for(int i = 0; i < answers.length; i++){
			int item_a = queue_a.poll();
			int item_b = queue_b.poll();
			int item_c = queue_c.poll();
			
			if(item_a == answers[i]) temp[0]++;
			if(item_b == answers[i]) temp[1]++;
			if(item_c == answers[i]) temp[2]++;
			
			queue_a.offer(item_a);
			queue_b.offer(item_b);
			queue_c.offer(item_c);
		}
		
		
		int max = 0;
		for(int i = 0; i < temp.length; i++){
			if(temp[max] < temp[i]) max = i;
		}
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < temp.length; i++){
			if(temp[i] == temp[max]) list.add(i);
		}
		int answer[] = new int[list.size()];
		for(int i = 0; i < list.size(); i++) answer[i] = list.get(i)+1;
        return answer;
    }

}
