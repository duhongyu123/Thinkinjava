package EightChapter.music;



/**
 * 
 * @author duhongyu  2018年12月5日
 *
 *super ---> sub    向上转型  静态方法是与类,而并非与单个对象相关联
 */

class StaticSuper{
	public static String staticget() {
		return "Base staticGet()";
	}
	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}
class StaticSub extends StaticSuper{
	public static String staticget() {
		return "Derived staticGet()";
	}
	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}
public class StaticPolymorphism {
	
	
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub();//upcast  向上转型
		System.out.println(sup.staticget());
		System.out.println(sup.dynamicGet());
		
		
	}

}
