
public class QuickSort extends Print{
	public QuickSort(int[] arr){
		super.printArr(arr);
		quicksort(arr, 0, arr.length-1);
		super.printArr(arr);
	}
	private void quicksort(int[] arr, int left, int right){
		if(left < right){
			int pivot = partition(arr, left, right);
			quicksort(arr, left, pivot-1);
			quicksort(arr, pivot+1, right);
		}
	}
	private int partition(int[] arr, int left, int right){
		int pivot = arr[right];
		int i = (left - 1);
		for(int j = left; j < right; j++){
			if(arr[j] <= pivot){
				i++;
				swap(arr, i, j);
			} 	
		}
		swap(arr, i+1, right);
		return i+1;
	}
	
	private void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
