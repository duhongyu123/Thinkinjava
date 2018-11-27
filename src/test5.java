


public class test5 {
	
	public static void main(String[] args) {
		
		
		Dog dog1 = new Dog();
		dog1.name = "spot";
		dog1.says ="Ruff";
		Dog dog2 = new Dog();
		dog2.name = "scruffy";
		dog2.says = "Wurf";
		
		System.out.println(	"spot.says----" +dog1.says);
		System.out.println("scruffy.says---"+dog2.says);
		
	}
	
	
	

}
class Dog{
	String name;
	String says;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSays() {
		return says;
	}
	public void setSays(String says) {
		this.says = says;
	}
	public Dog() {
		super();
	}
	
}