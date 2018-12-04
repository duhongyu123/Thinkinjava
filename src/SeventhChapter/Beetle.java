package SeventhChapter;

//:reusing/Beetle.java
// The full process of initialization
/**
 * 
 * @author duhongyu  2018年12月4日
 *
 *
 */
import static net.mindview.util.Print.*;


class Insect{
	private int i = 9;
	protected int j;
	Insect(){
		print("i = "+i+" , j= "+j);
		j = 39;
	}
	private static int x1 = 
			printInit("static Insect.x1");
	static int printInit(String s) {
		print(s);
		return 47;
	}
	
}
public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	public Beetle() {
		print("k = "+k);
		print("j = "+j);
	}
	private static int x2 = printInit("static Beetle.x2 initialized");
	
	
	public static void main(String[] args) {
		print("Beetle constructor");
		Beetle b = new Beetle();
	}
}