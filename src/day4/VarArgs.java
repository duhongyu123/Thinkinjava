package day4;



/**
 * 
 * @author duhongyu  2018年11月27日
 * 可变参数列表
 *
 */


class A{}

public class VarArgs {

	static void printArray(Object[] args) {
		// TODO Auto-generated method stub
		for(Object obj:args)
			System.out.print(" obj: "+obj);
			System.out.println();
	}

	
	
	public static void main(String[] args) {
		
		printArray(new Object[] {new Integer(1),new Float(3.14),new Double(11.11)});
		printArray(new Object[] {"one","two","three"});
		
		printArray(new Object[] {new A(),new A()});
	}
}

