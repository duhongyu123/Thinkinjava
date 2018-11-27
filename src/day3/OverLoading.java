package day3;

import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年11月24日
 * 方法重载
 *
 */
class Tree{
	int height;
	//无参数构造器
	Tree(){
		print("Planting a seeding");
		height = 0;
		
	}
	//有参数构造器
	Tree(int initialheight){
		height = initialheight;
		print("Creating new Tree height is "+ height+" feet tall");
	}
	void info()
	{
	 print("Tree is "+height+" feet tall");
	 
	}
	void info(String s){
		print(s+"Tree is "+height+" feet tall");
	}
}


public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<5 ;i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overload method");
			
			
			
			
		}
		
		new Tree();
	}

}
