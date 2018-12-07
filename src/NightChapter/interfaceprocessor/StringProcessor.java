package NightChapter.interfaceprocessor;

import java.util.Arrays;

/**
 * 
 * @author duhongyu  2018年12月5日
 *
 *
 */
public abstract class StringProcessor implements Processor{
	public String name() {
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
	public static String s = "If she weights the same as dumk,she's made mood";
	public static void main(String[] args) {
		
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitcase(), s);
		
		
		
	}

}
class Upcase extends StringProcessor{
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor{
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}


class Splitcase extends StringProcessor{
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}

