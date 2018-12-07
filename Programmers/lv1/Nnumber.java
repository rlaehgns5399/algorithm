package Programmers.lv1;

import java.util.ArrayList;
import java.util.HashMap;

/* https://programmers.co.kr/learn/courses/30/lessons/42895
 * Input: x=5, n=12
 * Output: 4
 * 
 * Input: x=-2, n=11
 * Output: 3
 */

public class Nnumber {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(Solution(5, 83));
			
		}
		public static int Solution(int E, int N){
			ArrayList<ArrayList<Integer>> dp = new ArrayList();
			HashMap<Integer, Integer> cnt = new HashMap();
			for(int i = 0; i < 9; i++){
				dp.add(new ArrayList<Integer>());
			}
			dp.get(1).add(E);
			cnt.put(E, 1);
			
			for(int i = 2; i <= 8; i++){
				int shift = dp.get(i-1).get(0) * 10 + E;
				dp.get(i).add(shift);
				cnt.put(shift, i);
				for(int j = 1; j < i; j++){
					for(Integer x : dp.get(j)){
						for(Integer y : dp.get(i - j)){
							if(cnt.get(x + y) == null){
								dp.get(i).add(x + y);
								cnt.put(x+y, i);
							}
							if(cnt.get(x - y) == null){
								dp.get(i).add(x - y);
								cnt.put(x-y, i);
							}
							if(cnt.get(x * y) == null){
								dp.get(i).add(x * y);
								cnt.put(x * y, i);
							}
							if( y != 0  && cnt.get(x / y) == null){
								dp.get(i).add(x / y);
								cnt.put(x / y, i);
							}
						}
					}
				}
			}
			
			return cnt.get(N);
		}
		
}
