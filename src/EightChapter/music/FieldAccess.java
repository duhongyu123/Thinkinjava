package EightChapter.music;
//:polymorphism/FieldAccess.ava
//Direct field access is determined at compile time



/**
 * 
 * @author duhongyu  2018年12月5日
 * 域与静态方法和多态不能用
 *
 */

class Super{
	public int field =0;
	public int getField() {return field;}
}

class Sub extends Super{
	public int field =1;
	public int getField() {return field;}
	public int getSuperField() {return super.field;}
}

public class FieldAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup = new Super();
		System.out.println("sup.field = "+sup.field+",sup.getField() = "+sup.getField());
		Sub sub = new Sub();
		System.out.println("sub.field = "+sub.field+",sub.getField() = "+sub.getField()+",sub.getSuperField() = "+sub.getSuperField());
	}

}
