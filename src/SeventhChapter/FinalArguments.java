package SeventhChapter;

//:reusing/FinalArguments.java
//:Using "final" with method arguments.
/**
 * 
 * @author duhongyu  2018年12月4日
 * final 参数
 *
 */

class Gizmo{
	public void spin() {}
}


public class FinalArguments {
	void with(final Gizmo g) {
		//!g = new Gizmo(); //Illgel -- g is final
	}
	
	void without(Gizmo g) {
		g = new Gizmo();// ok -- g no final
		g.spin();
	}
	//void f (final int i){i++;} //Can't change
	
	//You can only read from a final primitive
	int g(final int i) {return i+1;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalArguments bf = new FinalArguments();
		bf.with(null);
		bf.without(null);
		
		
	}

}
