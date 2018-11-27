package day2;

/**
 * 
 * @author duhongyu  2018年11月23日
 *	用构造器确保初始化
 *
 */
public class SimpleConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		for(int i = 0;i<10;i++)
			new Rock();
	}

}
class Rock{
	Rock(){ //This is the constructor
		System.out.print("Rock ");
	}
	
	
}