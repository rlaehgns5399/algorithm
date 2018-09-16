public class q4 {

	public static void main(String[] args) {
		int[] d = {0,2, 0, 2};
		System.out.println(solution(d, 25525));
		
	}
	public static int solution(int[] food_times, long k){
		int answer = 0;
		
		int index = 0;
		int counter = 0;
		boolean check = false;
		long total = 0;
		for(int i = 0; i < food_times.length; i++){
			total += food_times[i];
		}
		if(k == 0){
			for(int i = 0; i < food_times.length; i++){
				if(food_times[i] != 0) return i+1; 
			}
			return -1;
		}
		while(counter != k){
			if(total == 0){
				check = true;
				break;
			}
			
			index = index % food_times.length;
			if(food_times[index] != 0) {
				
				printArr(food_times);
				
				food_times[index]--;
				total--;
				counter++;
				
				index++;
				
				printArr(food_times);
				System.out.println(index-1 + "\n");
			}
			else {
				index++;
			}
			
			if(total == 0){
				check = true;
				break;
			}
		}
		
		if(check == true){
			answer = -1;
		} else {
			index = (index) % food_times.length;
			while( food_times[index] == 0){
				index = (index+1) % food_times.length;
			}
			answer = (index +1) % food_times.length;
		}
		
		return answer;
	}
	
	public static void printArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}