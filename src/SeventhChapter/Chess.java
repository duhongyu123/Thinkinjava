package SeventhChapter;

//:reusing/Chess.java
//Inheritance,constructors and arguments
import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年12月3日
 * 带参数的构造器
 * super 
 *
 */

class Game{
	Game(int i){
		print("Game constructor");
	}
}

class BoardGame extends Game{
	public BoardGame(int i) {
		//使用super 关键字 显示的调用基类构造器的语句
		super(i);//---->Game(int i)
		print("BoardGam constructor");
	}
}

public class Chess extends BoardGame{

	 Chess() {
		super(11);//Boad
		// TODO Auto-generated constructor stub
		print("Chess constructor");
	}
	 public static void main(String[] args) {
		Chess x =new Chess();
	}
	

}
