package day5;



/**
 * 
 * @author duhongyu  2018年12月3日
 *
 *
 */
class Soup1{
	//一个内部类可以是private的
	private Soup1() {}
	//(1) Allow created a static method;
	public static Soup1 makeSoup() {
		return new Soup1();
	}
	
}
class Soup2{
	private Soup2() {}
	//(2) Create a static object return a reference
	//upon request (The Singleton pattern 
	private static Soup2 ps1 = new Soup2();
	public static Soup2 access() {
		return ps1;
	}
	
	public void f() {}
	
}
public class Lunch {
	 void testPrivate() {
		 //Can't do this Private constructor;
		 //!Soup1 soup = new Soup1();
	 }
	 void testStatic() {
		 Soup1 soup = Soup1.makeSoup();
	 }
	 void testSingleton() {
		 Soup2.access().f();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
