package day5;

import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年12月3日
 * 初始化基类 --三层继承
 *
 */

	
	class Art{
		Art(){print("Art constructor");};
	}
	class Drawing extends Art{
			Drawing(){print("Drawing constructor");}
	}
		
	public class Cartoon extends Drawing{
		public Cartoon() {
			print("Cartoon constructor");
		}
		public static void main(String[] args) {
			Cartoon x = new Cartoon();
		}
	}
	// Cartoon() {print("Cartoon constructor");}

		// TODO Auto-generated method stub

	


