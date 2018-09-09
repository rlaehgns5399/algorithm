import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort extends Print{
	List<Integer> list;
	public MergeSort(List<Integer> arr){
		super.printList(arr);
		list = doMergeSort(arr);
		super.printList(list);
	}
	private List<Integer> doMergeSort(List<Integer> arr){
		if(arr.size() < 2) return arr;
		int pivot = (int)(arr.size() / 2);
		List<Integer> left = arr.subList(0, pivot);
		List<Integer> right = arr.subList(pivot, arr.size());
		return Merge(doMergeSort(left), doMergeSort(right));
	}
	
	private List<Integer> Merge(List<Integer> left, List<Integer> right){
		List<Integer> result = new ArrayList<Integer>();
		while(left.size() > 0 && right.size() > 0){
			if(left.get(0) <= right.get(0)){	// (<=) make stable
				result.add(left.get(0));
				left = left.subList(1, left.size());
			} else {
				result.add(right.get(0));
				right = right.subList(1, right.size());
			}
		}
		
		for(int i = 0; i < left.size(); i++){
			result.add(left.get(i));
		}
		for(int i = 0; i < right.size(); i++){
			result.add(right.get(i));
		}
		return result;
	}
}
