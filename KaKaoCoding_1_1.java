
public class KaKaoCoding_1_1 extends Print {
	public KaKaoCoding_1_1(int n, int[] arr1, int[] arr2){
		int[] result = new int[n];
		String[] result_arr = new String[n];
		for(int i = 0; i < n; i++){
			result[i] = arr1[i] | arr2[i];
		}
		
		for(int i = 0; i < result.length; i++){
			String temp = "";
			for(int j = 1; j <= result[i]; j *= 2){
				if((result[i] & j) > 0){
					temp = "#" + temp;
				} else {
					temp = " " + temp;
				}
			}
			result_arr[i] = temp;
		}
		
		super.printArr(result);
		super.printArr(result_arr);
	}
}
