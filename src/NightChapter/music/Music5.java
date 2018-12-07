package NightChapter.music;

//

/**
 * 
 * @author duhongyu  2018年12月5日
 *  interfaces/music/music.java
 *  interfaces
 *
 */

import static net.mindview.util.Print.*;

import EightChapter.music.Note;

interface Instrument{
	//private int i;//Storage allocated for each
	
	int VALUE = 5;//static & final

	void play(Note n) ;//Automatically public 
	
	void adjust() ;
}
class Wind implements Instrument{
	public void play(Note n) {print("Wind.play()"+n);}
	String what() {return "Wind";}
	public void adjust() {print("Adjusting Wind");}
}

class Percussion implements Instrument{
	public void play(Note n) {print("Percussion.play()"+n);}
	String what() {return "Percussion";}
	public void adjust() {print("Adjusting Percussion");}
}
class Stringed implements Instrument{
	public void play(Note n) {print("Stringed.play()"+n);}
	String what() {return "Stringed";}
	public void adjust() {print("Adjusting Stringed");}
}
class Brass implements Instrument{
	public void play(Note n) {print("Brass.play()"+n);}
	//String what() {return "Brass";}
	public void adjust() {print("Adjusting Brass");}
}

class Woodwing implements Instrument{
	public void play(Note n) {print("Woodwing.play()"+n);}
	String what() {return "Woodwing";}
	//void adjust() {print("Adjusting Woodwing");}
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
}
public class Music5 {
	//Doesn't care about type .so new types
	//added to the system still work right;
	
	 static void tune(Instrument i) {
		//....
		i.play(Note.MIDDLE_C);
	}
	 static void tuneAll(Instrument[] e) {
		for(Instrument i:e)
		tune(i);
	}
	public static void main(String[] args) {

			//Upcasting during addition to the array;
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwing()
		};
		tuneAll(orchestra);
		
		
		
	}

}
/**
 * 
 * Wind.play()MIDDLE_C
Percussion.play()MIDDLE_C
Stringed.play()MIDDLE_C
Brass.play()MIDDLE_C
Woodwing.play()MIDDLE_C

 * 
 */
