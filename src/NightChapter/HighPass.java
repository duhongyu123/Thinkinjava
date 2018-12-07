package NightChapter;

/**
 * 
 * @author duhongyu  2018年12月5日
 *
 *
 */
public class HighPass extends Filter{
	double cutoff;
	public HighPass(double cutoff) {this.cutoff=cutoff;}
	
	public Waveform process(Waveform input) {
		return input;//Dummy processing
	}
}
