package day2;

import java.util.Random;

/**
 * 
 * @author duhongyu  2018年11月23日
 * Foreach语法
 *
 */
public class ForEacheFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		float f[] = new float[10];
		
		for(int i = 0;i<10;i++)
			f[i] = rand.nextFloat();
		for(float x: f)
			System.out.println(x);
	}

}
