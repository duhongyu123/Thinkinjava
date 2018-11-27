package day4;

import static net.mindview.util.Print.*;


/**
 * 
 * @author duhongyu  2018年11月27日
 *	构造器初始化顺序
 *
 */
class Window{
	Window(int marker){
		print("Window :"+marker);
	}
}
class House{
	
	//故意将几个windows 对象  放在House 类的不同位置,验证 会在House构造器之前调用
	
	Window w1 = new Window(1);
	House(){
		//Show that we'are in the constructor
		print("House()");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	void f() {print("f()"); };
	Window w3 = new Window(3);
	
}
public class OrderInitialzation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House h =new House();
		h.f();
		
		
	}

}
