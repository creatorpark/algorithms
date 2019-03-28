package sort.compare;

import util.DataUtil;
import util.SortUtil;

public abstract class CompareSort {
	
	protected String sortAlgorithm = "Algorithm";
	
	public void sort() {
		int[] unsortedData = DataUtil.getUnsortedArray();
		SortUtil.showUnsortedData(sortAlgorithm, unsortedData );
		int[] sortedData = sort( unsortedData );
		SortUtil.showSortedData(sortedData);
	}

	public abstract int[] sort(int[] data);
}
