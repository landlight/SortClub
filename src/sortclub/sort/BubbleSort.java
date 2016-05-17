package sortclub.sort;

public class BubbleSort implements iSort{

	@Override
	public String[] stringSort(String[] items) {
		// TODO Auto-generated method stub
		boolean swapped = true;
		while(swapped == true){
			swapped = false;
			for(int i = 1; i < items.length; i++){
				if(items[i-1].compareTo(items[i]) > 0){	
					String temp = items[i-1];
					//System.out.println(arr[i-1] + "," + arr[i]);
					
					items[i-1] = items[i];
					items[i] = temp;

					//System.out.println(arr[i-1] + "," + arr[i]);
					swapped = true;
					for (String j : items){
			 			System.out.print("|"+ j + "|");
			 		}
					System.out.println();
				}
			}
		}
		return items;
	}

	@Override
	public int[] intSort(int[] items) {
		// TODO Auto-generated method stub
		boolean swapped = true;
		while(swapped == true){
			swapped = false;
			for(int i = 1; i < items.length; i++){
				if(items[i-1] > items[i]){	
					int temp = items[i-1];
					//System.out.println(arr[i-1] + "," + arr[i]);
					
					items[i-1] = items[i];
					items[i] = temp;

					//System.out.println(arr[i-1] + "," + arr[i]);
					swapped = true;
					for (int j : items){
			 			System.out.print("|"+ j + "|");
			 		}
					System.out.println();
				}
			}
		}
		return items;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
