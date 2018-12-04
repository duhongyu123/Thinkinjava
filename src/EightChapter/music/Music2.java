package EightChapter.music;

import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年12月4日
 * 多态2
 *Stringed 弦乐器 brass 乐器 tune 曲子调子
 */

class Stringed{
	public void play(Note n) {
		print("Stringed.play()"+n);
	}
}
class Brass{
	public void play(Note n) {
		print("Brass.play()"+n);
	}
}
public class Music2 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Wind i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tune(Stringed i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Brass i) {
		i.play(Note.MIDDLE_C);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute =new Wind();
		Stringed vilon = new Stringed();
		Brass  sks = new Brass();
		tune(flute);
		tune(vilon);
		tune(sks);
		
	}

}
