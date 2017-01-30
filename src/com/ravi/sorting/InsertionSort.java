package com.ravi.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	InsertionSort()
	{
		
	}
	private  static Integer in1[] = {4,2,5,8,9,6,3,1,7,10};
	
	public void insertionSort()
	{
		for(int j=1; j < in1.length ; ++j)
		{
			int key = in1[j];
			int i = j-1;
			while (i >= 0 && in1[i] > key)
			{
				in1[i+1] = in1[i];
				--i;
			}
			in1[i+1] = key;
		}
	}

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		System.out.println(Arrays.toString(in1));
		is.insertionSort();
		System.out.println(Arrays.toString(in1));
		
		

	}

}
