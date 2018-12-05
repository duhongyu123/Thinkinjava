package EightChapter.music;
import static net.mindview.util.Print.*;
/**
 * 
 * @author duhongyu  2018年12月5日
 *
 *
 */
class Actor{
	public void act() {
		
	}
}
class HappyActor extends Actor{
	public void act() {
		print("HappyActor");
		}
}

class SadActor extends Actor{
	public void act() {
		print("SadActor");
	}
}
class Stage{
	private Actor actor = new HappyActor();
	public void play(){
		actor.act();
	}
	public void change() {
		actor = new SadActor();
	}
}
public class Transmogrigy {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(17<<1);
		Stage stage =new Stage();
		stage.play();
		stage.change();
		stage.play();
	}
	
	
}
/*output:
	HappyActor
	SadActor

*/