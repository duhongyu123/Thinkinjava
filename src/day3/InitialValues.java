package day3;

import static net.mindview.util.Print.*;



/**
 * 
 * @author duhongyu  2018年11月26日
 * 成员初始化
 *
 */
public class InitialValues {

	
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	
	InitialValues reference;
	
	void printInitialValues() {
		print("Data type Initial value");
		print("boolean:"+t);
		print("char:"+c);
		print("byte:"+b);
		print("short:"+s);
		print("int:"+i);
		print("long:"+l);
		print("float:"+f);
		print("double:"+d);
		print("reference:"+reference);
		
		
		
	}
	
	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
		
		
		
		
		
		
		new InitialValues().printInitialValues();
		
		
		
		
		
		
	}

}
