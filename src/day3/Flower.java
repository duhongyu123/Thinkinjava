package day3;

import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年11月26日
 * 在构造器中调用构造器
 *
 */
public class Flower {
	
	int petalCount = 0;
	String s = "initial value";
	Flower(int petals){
		petalCount = petals;
		print("Constructor w / int arg only,petalCount = "+petalCount);
		
		
		
	}
	Flower(String ss){
		print("Constructor w/ String arg only,s +"+ss);
		s = ss;
	}
	
	
	Flower(String ss,int petals){
		this(petals);
		//! this(s);
		this.s = s;  //Another use of "this"
		print("String & int args");
		s = ss;
	}
	Flower(){
		this("hi",47);
		print("default constructor(no args_");
	}
	void printPetalCount() {
		//! this(11);  //Not inside non_constructor
		print("petalCout = "+petalCount+"  S = "+s);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower x = new Flower();
		x.printPetalCount();
		
	}

}
