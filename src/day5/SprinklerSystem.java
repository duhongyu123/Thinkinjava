package day5;



/**
 * 
 * @author duhongyu  2018年12月3日
 *	 resuing/SprinkSystem.java
 *	Compostion for code reuse
 */
class WaterSource{
	private String s;
	
	WaterSource(){
		System.out.println();
		s = "Constructed";
	}
	
	public String toString() {return s;}
	
	
}






public class SprinklerSystem {
	private String valve1,valve2,valve3,valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	
	
	
	
	
	@Override
	public String toString() {
		return "SprinklerSystem [valve1=" + valve1 + ", valve2=" + valve2 + ", valve3=" + valve3 + ", valve4=" + valve4
				+ ", source=" + source + ", i=" + i + ", f=" + f + "]";
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SprinklerSystem sprinkler = new SprinklerSystem();
		System.out.println(sprinkler);
		
	}

}
