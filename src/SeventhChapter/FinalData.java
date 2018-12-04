package SeventhChapter;

import java.util.*;
import static net.mindview.util.Print.*;

class Value{
	int i; //Package access;
	public Value(int i) {this.i = i;}
	
	
}

/**
 * 
 * @author duhongyu  2018年12月3日
 *	final 数据
 *
 */
public class FinalData {
	private static Random rand = new Random(47);
	private String id;
	public FinalData(String id) {this.id = id;}
	//Can be compile-time  constans
	private final int valueone = 9;
	private  static final int value_two = 99;
	//Typical public constant;
	public static final int VALUE_THREE = 39;//常见变量声明方式
	//Cannot be compile-time constants;
	private final int i4 = rand.nextInt(20);
	private final int Int_5 = rand.nextInt(20);
	
	private Value v1 = new Value(11);
	
	private final Value v2 = new Value(22);
	
	private static final Value VAL_3 = new Value(33);
	
	//Arrays;
	private final int[] a = {1,2,3,4,5};
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+":"+"i4 = "+i4+",INT_5:"+Int_5;
		
	}
	
	
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		//!fd.valueOne++  ;//Error. can't change value
		 fd1.v2.i++;
		 fd1.v1 = new Value(9);
		 for(int i=0;i<fd1.a.length;i++) {
			 fd1.a[i]++;//Object isn't constant!
			 //!fd1.v2 = new value(0); //Error can't
			 ///!fd1.VAL_3 = NEW Value(1)  //change reference
			 //fd1.a = new int[3]
	     print(fd1);
	     print("Creating new FinalData");
		 FinalData fd2 = new FinalData("fd2");
	     print(fd1);
		 print(fd2);
			 
			 
			 
			 
			 
		 }
		
		
		
		
		
		
		
	}

}
