package day2;



/**
 * 
 * @author duhongyu  2018年11月23日
 * 构造器参数形式
 *
 */
public class SimpleConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<10;i++)
		{
			new Rock2(i);
		}
	}

}
class Rock2{
	Rock2(int i ){
		System.out.print("Rock: "+i+" ");
	}
	
	
}