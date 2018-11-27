package day2;

import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年11月23日
 * 操作符+  和+=*
 */
public class StringOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0,y = 1, z= 2;
		String s = "x,y,z";
		print(s+x+y+z);
		print(x+ " "+s); ///Converts x to a String
		s +="(sumed) = ";
		print(s+(x+y+z));
		print(""+x);
	}

}
