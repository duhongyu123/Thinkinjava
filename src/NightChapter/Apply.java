//package NightChapter;
//import java.util.*;
//import static net.mindview.util.Print.*;
//
///**
// * 
// * @author duhongyu  2018年12月5日
// * 完全解耦
// *策略设计模式
// */
//
//class Processor{
//	public String name() {
//		return getClass().getSimpleName();
//	}
//	//?  
//	Object process(Object input) {return input;}
//}
//
//class Upcase extends Processor{
//	
//	String process(Object input) {
//		return ((String)input).toUpperCase();
//	}
//}
//class Downcase extends Processor{
//	String process(Object input) {
//		return ((String)input).toLowerCase();
//	}
//}
//class Spiltcase extends Processor{
//	String process(Object input) {
//		return Arrays.toString(((String)input).split(" "));
//	}
//}
//public class Apply {
//	
//	public  static void process(Processor p,Object s) {
//		print("Using Processor "+ p.name());
//		print(p.process(s));
//	}
//	public static String s = "Disagreement with beliefs is by definition incorrect";
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		process(new Downcase(), s);
//		process(new Upcase(), s);
//		process(new Spiltcase(), s);
//
//	}
//
//}
