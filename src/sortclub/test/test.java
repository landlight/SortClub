package sortclub.test;

import java.util.Arrays;
import java.util.regex.Pattern;

import sortclub.sort.BubbleSort;
import sortclub.sort.QuickSort;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st = {"eat","abce","abcd","gosugamers","a"};
		int[] in = {5,4,7,6,2,1};

		
		//BubbleSort b = new BubbleSort();
		//b.stringSort(st);
		
		
		QuickSort q = new QuickSort();
		st = q.stringSort(st);	
		for(String num  : st){
			System.out.print("|"+ num + "|");
		}
		System.out.println();
	}

}
