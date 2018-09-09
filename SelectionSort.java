
public class SelectionSort extends Print{
	public SelectionSort(int[] arr){
		super.printArr(arr);
		int min;
		for(int i = 0; i < arr.length - 1; i++){
			min = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[min] > arr[j]) min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		super.printArr(arr);
	}
}
