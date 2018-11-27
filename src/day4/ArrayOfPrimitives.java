package day4;


import static net.mindview.util.Print.*;


/**
 * 
 * @author duhongyu  2018年11月27日
 *
 * 数组初始化   a2 指向a1的地址 
 */
public class ArrayOfPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,3,4,5};
		int[] a2;
		a2 = a1;
		for(int i=0;i<a2.length;i++)
			a2[i] = a2[i]+1;
		for(int i=0;i<a1.length;i++)
			print("a1["+i+"]:"+a1[i]);
		
		
		
		
	}

}
