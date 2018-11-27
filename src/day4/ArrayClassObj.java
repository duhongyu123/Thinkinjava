package day4;

import static net.mindview.util.Print.*;


import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author duhongyu  2018年11月27日
 * 数组对象
 *
 */
public class ArrayClassObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		
		//很少这么做的
		Integer[] a = new Integer[rand.nextInt(20)];
		
		print("length of a:" +a.length);
		
		for(int i=0;i<a.length;i++) {
			a[i] = rand.nextInt(400);
		}
		print(Arrays.toString(a));
		
		
 		
		
	}

}
