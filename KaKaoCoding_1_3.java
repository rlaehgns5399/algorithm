
public class KaKaoCoding_1_3 extends PrintArr{
	public KaKaoCoding_1_3(int n, String[] str){
		if(n == 0){
			System.out.println(5 * str.length);
		} else {
			String[] list = new String[n];
			int[] Recently = new int[n];
			int pointer = 0;
			int result = 0;
			for(int i = 0; i < n; i++) Recently[i] = 0;
			for(int i = 0; i < str.length; i++){
				boolean isCache = false;
				for(int j = 0; j < n; j++){
					if(str[i].toLowerCase().equals(list[j])){
						result++;
						//System.out.println(str[i] + " is found at index " + j + "(" + str[j] + ")");
						isCache = true;
						//super.printArr(list);
						break;
					} 
				}
				
				if(!isCache){
					int max = 0;
					for(int j = 0; j < n; j++){ 
						if(Recently[j] > Recently[max]){
							max = j;
						}
					}
					pointer = max;
					//System.out.println(str[i] + " Fail! write to index " + pointer);
					list[pointer] = str[i].toLowerCase();
					for(int j = 0; j < n; j++){
						Recently[j]++;
						Recently[pointer] = 0;
					}
					
					result += 5;
					//super.printArr(list);
				} 
				
			}
			System.out.println(result);
		}
		
	}
}
