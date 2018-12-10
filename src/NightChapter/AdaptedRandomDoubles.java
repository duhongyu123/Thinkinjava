package NightChapter;
//:interfaces/AdaptedRandomDoubles.java
//Creating an adapter with inheritance


import java.io.IOException;
import java.nio.*;
import java.util.*;


/**
 * 
 * @author duhongyu  2018年12月10日
 *
 *
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable{
	private int count;
	public AdaptedRandomDoubles(int count) {
		this.count = count;
	}
	public int read(Character cb) {
		if( count-- == 0)
			return -1;
		String result = Double.toString(next())+" ";
	//	cb.append(result);
		
		return result.length();
		
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomDoubles(7));
		while(s.hasNextDouble())
			System.out.println(s.nextDouble()+" ");
		
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
