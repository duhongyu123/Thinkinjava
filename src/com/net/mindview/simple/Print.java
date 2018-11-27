package com.net.mindview.simple;



import java.io.*;

/**
 * 
 * @author duhongyu  2018年11月27日
 *
 *
 */
public class Print {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static void print() {
		System.out.println();
	}
	
	//Print with no line break;
	public static void printnb(Object obj) {
		System.out.print(obj);
	}
	//The new java SE5 printf(_) (from C);
	public static PrintStream
	
	printf(String format,Object... args){
		return System.out.printf(format,args);
	}
	
	
	
}
