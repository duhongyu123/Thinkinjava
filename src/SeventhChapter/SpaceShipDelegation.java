package SeventhChapter;


/**
 * 
 * @author duhongyu  2018年12月3日
 *
 *
 */
public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls  controls = new SpaceShipControls();
	
	public SpaceShipDelegation(String name) {
		this.name =  name;
	}
	
	public void up(int velocity) {
		controls.up(velocity);
	}
	public void down(int velocity) {
		controls.down(velocity);
	}
	
	public void left(int velocity) {
		controls.left(velocity);
	}
	public void right(int velocity) {
		controls.right(velocity);
	}
	public void forward(int velocity) {
		controls.forward(velocity);
	}
	public void back(int velocity) {
		controls.back(velocity);
	}
	
	//Delegated methods;
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpaceShipDelegation protector = new SpaceShipDelegation("NESA ");
		protector.back(100);
	}








	public SpaceShipDelegation() {
		super();
		// TODO Auto-generated constructor stub
	}

}
