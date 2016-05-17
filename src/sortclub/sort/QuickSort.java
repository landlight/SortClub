package sortclub.sort;

/*
 algorithm quicksort(A, lo, hi) is
 if lo < hi then
 p := partition(A, lo, hi)
 quicksort(A, lo, p)
 quicksort(A, p + 1, hi)

 algorithm partition(A, lo, hi) is
 pivot := A[lo]
 i := lo – 1
 j := hi + 1
 loop forever
 do
 i := i + 1
 while A[i] < pivot
 do
 j := j – 1
 while A[j] > pivot
 if i >= j then
 return j
 swap A[i] with A[j]
 */

public class QuickSort implements iSort {

	@Override
	public String[] stringSort(String[] items) {
		// TODO Auto-generated method stub
		items = stringQuickSort(items, 0, items.length - 1);
		return items;
	}

	@Override
	public int[] intSort(int[] items) {
		items = intQuickSort(items, 0, items.length - 1);
		return items;
	}

	private String[] stringQuickSort(String[] items, int startPoint, int length) {
		// TODO Auto-generated method stub
		if (items == null || items.length == 0){
			return items;
		}
		if (startPoint >= length) {
			return items;
		}

		int middle = startPoint + ((length - startPoint) / 2);
		String pivot = items[middle];
		
		int i = startPoint;
		int j = length;

		while (i <= j) {
			while (items[i].compareTo(pivot) < 0) {
				i++;
			}
			while (items[j].compareTo(pivot) > 0) {
				j--;
			}
			if (i <= j) {
				String temp = items[i];
				items[i] = items[j];
				items[j] = temp;
				i++;
				j--;
			}
		}
		if (startPoint < j) {
			stringQuickSort(items, startPoint, j);
		}
		if (length > i) {
			stringQuickSort(items, i, length);
		}
		return items;
	}
	
	private int[] intQuickSort(int[] items, int startPoint, int length) {
		// TODO Auto-generated method stub
		if (items == null || items.length == 0){
			return items;
		}
		if (startPoint >= length) {
			return items;
		}

		int middle = startPoint + ((length - startPoint) / 2);
		int pivot = items[middle];
		
		int i = startPoint;
		int j = length;

		while (i <= j) {
			while (items[i] < pivot) {
				i++;
			}
			while (items[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = items[i];
				items[i] = items[j];
				items[j] = temp;
				i++;
				j--;
			}
		}
		if (startPoint < j) {
			intQuickSort(items, startPoint, j);
		}
		if (length > i) {
			intQuickSort(items, i, length);
		}
		return items;
	}

}
