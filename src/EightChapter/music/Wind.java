package EightChapter.music;
//polymophism/music/Instrument.java
import static net.mindview.util.Print.*;




/**
 * 
 * @author duhongyu  2018年12月4日
 * Wind objects are instruments
 * beacause they have the sanme interface
 * 多态
 */
//乐器
class Instrument{
	public void play(Note n) {
		print("Instrument.play()");
	}
}
public class Wind extends Instrument{
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Wind.play()"+n);
	}

}
