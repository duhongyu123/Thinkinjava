package day2;



/**
 * 
 * @author duhongyu  2018年11月23日
 * 类型转换操作符
 *
 */
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 200;
			long lng = (long)i;
			lng = i;//widening so cast no really required
			long lng2 = (long)200;
			lng2 = 200;
			i = (int)lng2;
			
	}

}
