import java.util.ArrayList;
import java.util.List;

public class SelectionSortStable extends Print{
	public SelectionSortStable(List<ISElement> arr) {
		super.printStableList(arr);
		List<ISElement> stableList = new ArrayList<ISElement>();
		int ListIndex = 0;
		int min;
		for(int i = 0; i < arr.size(); i++){
			min = i;
			for(int j = i + 1; j < arr.size(); j++){
				if(arr.get(min).index > arr.get(j).index) min = j;
			}
			// stableList.remove(i);
			
			stableList.add(new ISElement(arr.get(min).index, arr.get(min).content));
			arr.remove(min);
			arr.add(i, new ISElement(Integer.MAX_VALUE, 0));	// empty Node
		}
		super.printStableList(stableList);
	}
}
