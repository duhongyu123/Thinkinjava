package SeventhChapter;

import static net.mindview.util.Print.*;



/**
 * 
 * @author duhongyu  2018年12月3日
 *
 *
 */
class Plate{
	public Plate(int i ) {
		print("Plate constructor");
	}
}
class DinnerPlate extends Plate{
	
	DinnerPlate(int i){
		super(i);
		print("DinnerPlate constructor");
	}
}
class Utensil{
	Utensil(int i){
		print("Utensil constructor");
	}
}
class Spoon extends Utensil{
	Spoon(int i){
		super(i);
		print("Spoon constructor");
	}
	
}
class Fork extends Utensil{
	Fork(int i){
		super(i);
		print("Fork constructor");
	}
}

class Knife extends Utensil{
	Knife(int i){
		super(i);
		print("Knife constructor");
	}
}
//A cultural way of doing something

class Custom{
	 Custom(int i) {
		 print("Custom constructor");
	 }
}

public class PlaceSetting extends Custom {

	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;
	public PlaceSetting(int i) {
		super(i+1);
		sp = new Spoon(i+2);
		frk = new Fork(i+3);
		kn = new Knife(i+4);
		pl = new DinnerPlate(i+5);
		print("PlaceSetting Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceSetting x = new PlaceSetting(9);
	}

}
