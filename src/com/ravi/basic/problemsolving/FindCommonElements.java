package com.ravi.basic.problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class FindCommonElements {
	
	int in1[]={1,3,5,7,9,11,13,15,17,19};	
	int in2[]={2,4,6,8,10,11,12,13,14,15,16};
	Scanner scanner = new Scanner(System.in);
	
	public FindCommonElements() {
	
	}
	
	public int solution1()
	{
		int count =0;
		for(int i = 0; i < in1.length ; ++i)
		{
			for(int j = 0; j < in2.length ; ++j)
			{
				if (in1[i] == in2[j])
				{
					++count;
				}
			}
		}
		return count;
	}

	public int solution2()
	{
		Arrays.sort(in1);
		Arrays.sort(in2);
		
		int i = 0, j = 0, count =0;
		while(i < in1.length&&j < in2.length)
		{			
				if (in1[i] == in2[j])
				{
					++count;
					++i;
					++j;
				}
				else if(in1[i] < in2[j])
				{
					++i;
				}
				else
				{
					++j;
				}
			
		}
		return count;
	}


	public static void main(String[] args) {
		FindCommonElements fce = new FindCommonElements();
		System.out.println("Solution 1 : " +fce.solution1());
		System.out.println("Solution 2 : " +fce.solution2());
	}

}
