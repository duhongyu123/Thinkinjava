//:access/IceCream.java
// Demonstrates "private" keyword

package day4;


class Sundae {
	private Sundae() {}
	static Sundae makesundate()
	{
		return  new Sundae();
	}
	
	
}

/**
 * 
 * @author duhongyu  2018年11月27日
 * private:你无法访问
 *
 */
public class IceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//!Sundae x = new Sundate();
		
		Sundae x = Sundae.makesundate();
	
	}

}
