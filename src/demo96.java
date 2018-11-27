import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年11月22日
 *
 *
 */

public class demo96 {
	public static void main(String[] args) {
		
		
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		t1.level = 9;
		t2.level = 47;
		
		print("t1.level --- "+t1.level+"t2.level  ---- "+t2.level);
		
		t1 = t2;
		//那么表示  t1 = t2  都指向t2 
		//这意味着假若对象c=d  那么c和 d都指向原来本指向d指向的那个对象
		
		print("t1.level  ---"+t1.level+"t2.level---  "+t2.level);
		
		t1.level = 27;
		
		print("t1.level--  "+t1.level+"t2.level -- "+t2.level);
		
		
	}
	
	
	
	
}

class Tank{
	
	
	int level;
}