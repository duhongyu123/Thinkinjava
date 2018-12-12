package TenChapter;
//:innerclasses/Parcell.java
//Creating inner classes;


public class Parcell {
	class Contents {
		private int i = 11;
		public int value() {return i;}
	}
	
	class Destination{
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readlabel() {return label;}
	}
	
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readlabel());
		
	}
	
	//Using inner classes looks just like;
	//using an
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Parcell p = new Parcell();
			p.ship("Tasmania");
	}

}
