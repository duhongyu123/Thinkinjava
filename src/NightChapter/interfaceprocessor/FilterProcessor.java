package NightChapter.interfaceprocessor;

import NightChapter.BandPass;
import NightChapter.Filter;
import NightChapter.HighPass;
import NightChapter.LowPass;
import NightChapter.Waveform;

/**
 * 
 * @author duhongyu  2018年12月5日
 *
 *
 */
class FilterAdapter implements Processor{
	
	Filter filter;
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	public String name() {return filter.name();}
	public Waveform process(Object input) {
		return filter.process((Waveform)input);
		
	}
	
	
}

public class FilterProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0,4.0)), w);
	}

}
