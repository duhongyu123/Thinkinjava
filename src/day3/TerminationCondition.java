package day3;

/**
 * 
 * @author duhongyu 2018年11月26日
 * 终结条件  ----finalize()可能的使用方式
 *
 */

class Book {
	boolean checkedOut = false;

	Book(boolean checkOut) {
		checkedOut = checkOut;
	}

	void checkIn() {
		checkedOut = false;
	}

	protected void finalize() {
		if (checkedOut)
			System.out.println("Error : checked out");
		// normally ,you'll also do this
		// super.finalize(); // Call the base-class version
	}

}

public class TerminationCondition {

	public static void main(String[] args) {

		Book novel = new Book(true);
		// Proper cleanup
		novel.checkIn();
		
		//当存在书本为被签入,
		// drop the reference, forge to clean up
		new Book(true);
		// force garbage collection & finalization
		System.gc();
	}

}
