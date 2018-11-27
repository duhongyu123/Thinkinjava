package day2;
/**
 * 
 * @author duhongyu  2018年11月23日
 *  for 循环
 *
 */
public class ListCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for (char c = 0 ;c<128;c++)
		 {
			 if(Character.isLowerCase(c)) {
				 System.out.println("value:"+(int)c+"   character:"+c);
			 }
			 
			 
		 }

	}

}
