
public class InsertionSort extends Print{
	private int[] arr;
	
	public InsertionSort(int[] arr){
		super.printArr(arr);
		int i, j, temp;
		for(i = 1; i < arr.length; i++){
			temp = arr[i];
			for(j = i - 1; j >= 0; j--){
				if(temp > arr[j]) break;
				arr[j+1] = arr[j];
			}
			arr[j + 1] = temp;
		}
		super.printArr(arr);
		this.arr = arr;
	}
	
	public int[] getArr(){
		return this.arr;
	}
}
