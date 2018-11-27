package day4;

import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author duhongyu  2018年11月27日
 * 
 *
 */
public class ArrayNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a;
			Random rand = new Random(46);
			//数组长度由rand.nextInt 决定 返回一个随机值
			a = new int[rand.nextInt(20)];
			
			
			print("a length:"+a.length);
			print(Arrays.toString(a));
			
	}

}
