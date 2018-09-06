
public class BubbleSort extends PrintArr{
	public BubbleSort(int[] arr){
		super.printArr(arr);
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length - i && j+1 < arr.length; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		super.printArr(arr);
	}
}
