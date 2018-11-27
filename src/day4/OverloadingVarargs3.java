package day4;




/**
 * 
 * @author duhongyu  2018年11月27日
 * 单引号是char 类型   双引号是 string 类型
 * 
 *
 */
public class OverloadingVarargs3 {
	
	
	
	static void f(float i,Character... args) {
		System.out.println("first");
	}
	static void f(char c,Character... args) {
		System.out.println("second");
	}
	
	public static void main(String[] args) {
		f(1,'a');
		f('a','b');
	}
}
