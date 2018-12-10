package NightChapter;


/**
 * 
 * @author duhongyu  2018年12月7日
 * :interface /HorrorShow.java
 * Extending an interface with inheritance
 *
 */
interface Monster{
	void menace();
}
interface DangerousMonster extends Monster{
	void destory();
}
interface Lethal{
	void kill();
}
class DragonZilla implements DangerousMonster{
	public void menace() {}
	public void destory() {}
}

interface Vampire extends  DangerousMonster,Lethal{
	void drinkBlood();
}
class VeryBadVampire implements Vampire{

	@Override
	public void destory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menace() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drinkBlood() {
		// TODO Auto-generated method stub
		
	}
	
}

public class HorrorShow {
	static void u(Monster b) {b.menace();}
	static void v(DangerousMonster d) {
		d.menace();
		d.destory();
	}
	static void w(Lethal l) {l.kill();}
	public static void main(String[] args) {

		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		
		Vampire b = new VeryBadVampire();
		u(b);
		v(b);
		
	}

}
