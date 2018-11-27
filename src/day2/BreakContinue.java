package day2;

import static net.mindview.util.Range.*;

/**
 * 
 * @author duhongyu  2018年11月23日
 * 循环中断
 *
 */
public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0;i<100;i++) {
			if(i==74) break;//Out of for loop
			if(i%9 !=0) continue;
			System.out.println(i+ " ");
			
			
			
		}
		System.out.println();
		for(int i:range(100)) {
			
			if(i==74) break;//Out of for loop
			if(i%9 !=0) continue;
			System.out.println(i+ " ");
		}
		
		System.out.println();
		int i = 0;
		//AN infinite loop
		while (true) {
			i++;
			int j =i*27;
			if(j==1269)break;
			if(i%10==0) continue;
			System.out.println(i+" ");
			
		}
		
		
		
	}

}
