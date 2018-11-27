package day2;

import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年11月23日
 *位移操作符
 *
 */
public class URShift112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = -1;
		print(Integer.toBinaryString(i));
		i >>>= 10;
		print(Integer.toBinaryString(i));
		long l = -1;
		print(Long.toBinaryString(l));
		l >>>= 10;
		print(Long.toBinaryString(l));
		short s = -1;
		print(Integer.toBinaryString(s));
		s >>>= 10;
		print(Integer.toBinaryString(s));
		byte b = -1;
		print(Integer.toBinaryString(b));
		b >>>= 10;
		print(Integer.toBinaryString(b));
		b = -1;
		print(Integer.toBinaryString(b));
		print(Integer.toBinaryString(b>>>10));
		
		
		
	}

}
