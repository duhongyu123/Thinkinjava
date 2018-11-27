import static net.mindview.util.Print.*;

public class demo97 {
	static void f (Letter y) {
		y.c = 'z';
	}
	
	public static void main(String[] args) {
		
		Letter x = new Letter();
		x.c = 'a';
		print("x.c--"+x.c);
		
		//引用传递  
		f(x);
		print("x.c--"+x.c);
		
		
	}
	
}


class Letter{
	char c;
}
