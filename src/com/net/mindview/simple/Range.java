package com.net.mindview.simple;



/**
 * 
 * @author duhongyu  2018年11月27日
 *
 *
 */
public class Range {
	//Produce a sequence [0..n]
	public static int[] range(int n) {
		int[] result = new int[n];
		for(int i=0;i<n;i++)
			result[i] = i;
		return result;
		
	}
	
	//Produce a sequence [start,end]
	
	public static int[] range(int start,int end) {
		int sz = end - start;
		int[] result = new int[sz];
		for(int i = 0;i<sz;i++)
			result[i] = start +i;
		return result;
		

	}
	//Prodeuce a sequence [start,end] increment by step
	public static int[] range(int start,int end,int step) {
		
		int sz = (end-start)/step;
		int[] result = new int[sz];
		for(int i = 0;i<sz;i++)
		{
			result[i] = start+i*step;
			
		}
       return result;
	}
	
	
	
	
	
}
