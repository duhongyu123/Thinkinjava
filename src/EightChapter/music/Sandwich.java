package EightChapter.music;
//Sandwich.java
//Order of constructor
//java 优先级
import static net.mindview.util.Print.*;

class Meal{
	Meal(){print("Meal()");};
}
class Bread{
		Bread(){print("Bread()");};
}
class Cheese{
		 Cheese() {print("Cheese()");}	
}
		
class Lettuce{
	     Lettuce() {
			print("Lettuce()");
		}
}
class Lunch extends Meal{
	Lunch(){print("Lunch()");}
}
//轻便的
class PortableLunch extends 	Lunch{
	PortableLunch(){print("PortableLunch()");}
}
public class Sandwich extends PortableLunch {
	
	private Bread b = new Bread();
	private Cheese c= new Cheese();
	private Lettuce d =new Lettuce();
	
	public static void main(String[] args) {
		new Sandwich();
	}
	
	
}
/*output
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
*/

