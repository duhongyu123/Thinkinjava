package NightChapter;




public class BandPass extends Filter{
	double lowCutoff,highCutoff;
	public BandPass(double lowCuto,double highCutoff) {
		this.lowCutoff=lowCuto;
		this.highCutoff = highCutoff;
		
	}
	
	public Waveform process(Waveform input) {
		return input;//Dummy processing
	}
}
