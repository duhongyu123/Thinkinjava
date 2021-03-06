package NightChapter;
//:interfaces/Factories.java

/**
 * 
 * @author duhongyu  2018年12月10日
 *  工厂方法设计模式
 *
 */
import static net.mindview.util.Print.*;

interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	public Implementation1() {
	} // Package access

	@Override
	public void method1() {
		print("Implementation1 method1()");
	}

	@Override
	public void method2() {
		print("Implementation1 method2()");
	}

}

class Implementation1Factory implements ServiceFactory {

	@Override
	public Service getService() {
		return new Implementation1();
	}

}

class Implementation2 implements Service {
	Implementation2() {
	}

	public void method1() {
		print("Implementation2 method1()");
	}

	public void method2() {
		print("Implementation2 method2()");
	}

}

class Implementation2Factory implements ServiceFactory {

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation2();
	}

}

public class Factories {

	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();

	}

	public static void main(String[] args) {

		Factories.serviceConsumer(new Implementation1Factory());
		// Implementations are completely interchangeable;
		Factories.serviceConsumer(new Implementation2Factory());

	}
}
/*
 * 
 * 
 * Implementation1 method1()
Implementation1 method2()
Implementation2 method1()
Implementation2 method2()

 */


