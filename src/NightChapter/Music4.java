package NightChapter;




/**
 * 
 * @author duhongyu  2018年12月5日
 * 将第八章Instrument 类转化为abstract 类
 *
 */

import static net.mindview.util.Print.*;

import EightChapter.music.Note;


abstract class Instrument{
	private int i;//Storage allocated for each
	void play(Note n) {print("Instrument.play()"+n);}
	String what() {return "Instrument";}
	void adjust() {print("Adjusting Instrument");}
}
class Wind extends Instrument{
	void play(Note n) {print("Wind.play()"+n);}
	String what() {return "Wind";}
	void adjust() {print("Adjusting Wind");}
}

class Percussion extends Instrument{
	void play(Note n) {print("Percussion.play()"+n);}
	String what() {return "Percussion";}
	void adjust() {print("Adjusting Percussion");}
}
class Stringed extends Instrument{
	void play(Note n) {print("Stringed.play()"+n);}
	String what() {return "Stringed";}
	void adjust() {print("Adjusting Stringed");}
}
class Brass extends Instrument{
	void play(Note n) {print("Brass.play()"+n);}
	//String what() {return "Brass";}
	void adjust() {print("Adjusting Brass");}
}

class Woodwing extends Instrument{
	void play(Note n) {print("Woodwing.play()"+n);}
	String what() {return "Woodwing";}
	//void adjust() {print("Adjusting Woodwing");}
}
public class Music4 {
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
