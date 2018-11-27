package day2;




import static net.mindview.util.Print.*;

import java.util.Random;
public class VowelsAndConsotans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		
		for(int i = 0;i<100;i++) {
			int c = rand.nextInt(26)+'a';
			printnb((char)c+"."+c+":");
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':print("vowel");
			break;
			case 'y':
			case 'w':print("Sometimes a vowel");
			break;
			default:print("consotans");

			}
			
		}
		
	}

}
