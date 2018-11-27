package day2;

import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年11月23日
 * 三元操作符 if-else
 *
 */
public class TernaryIfElse117 {

	static int ternary(int i) {
		return i<10?i*100:i*10;
	}
	
	static int standardIfElse(int i) {
		if(i < 10)
			return i*100;
		else
			return i*10;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(ternary(9));
		print(ternary(10));
		print(standardIfElse(9));
		print(standardIfElse(10));
		
		
	}

}
