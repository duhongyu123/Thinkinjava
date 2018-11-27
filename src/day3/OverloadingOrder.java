package day3;

import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年11月24日
 *	区分重载方法
 *
 */
public class OverloadingOrder {

	static void f(String s,int i)
	{
		print("String: "+ s +",int:"+i);
	}
	static void f(int i,String s) {
		print("int:"+i+"String:"+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	f("String firt",11);
	f(99," Int firsst ");
		
		
		
		
	}

}
