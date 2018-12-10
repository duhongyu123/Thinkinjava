package NightChapter;

/**
 * 
 * @author duhongyu  2018年12月7日
 *
 *  使用接口的核心原因,对象向上转型为多个基类型,
 */
interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}

interface CanFly{
	void fly();
}
class ActionCharactor{
	public void fight() {}
}

class Hero extends ActionCharactor implements CanFight,CanSwim,CanFly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Adventure {
	public static void t(CanFight x) {x.fight();}
	public static void u(CanSwim x) {x.swim();}
	public static void v(CanFly x) {x.fly();}
	public static void w(ActionCharactor x) {x.fight();}
	public static void main(String[] args) {
		
		Hero h = new Hero();
		t(h);//Treat it as CanFight 
		u(h);//Treat it as CanSwim
		v(h);//Treat it as CanFly
		w(h);//Treat it as ActionCharactor
		
	
		
	}
	
	
	
	
}
