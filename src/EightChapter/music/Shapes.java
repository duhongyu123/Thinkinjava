package EightChapter.music;

/**
 * 
 * @author duhongyu  2018年12月4日
 * 工厂模式   
 * 
 * 随机选择几何形状为了让大家理解,在编译时,编译器不需要获得任何特殊信息就能进行正确的调用,对draw()方法的调用都是通过动态绑定
 * 
 *
 */
public class Shapes {
    private static RandomShapeGenerator rsg = new RandomShapeGenerator();
    
    public static void main(String[] args) {
		Shape[] s = new Shape[9]; //创建一个9大小的shape 数组
		
		for(int i=0;i<s.length;i++) {
			s[i]  = rsg.next();
			
		}
		//Make polymorphic method calls
		for(Shape s1:s) {
			s1.draw();
		}
 		
    	
    	
    	
    	
	}
}
