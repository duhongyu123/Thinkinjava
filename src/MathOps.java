import java.util.Random;

import static net.mindview.util.Print.*;

/**
 * 
 * @author duhongyu  2018年11月22日
 *
 *
 */
public class MathOps {

	public static void main(String[] args) {
		//create a seeder random number generator
		Random rand = new Random(47);
		
		int i,j,k;
		//choose value from 1 to 100
		j = rand.nextInt(100)+1;
		print("j :"+j);
		k = rand.nextInt(100)+1;
		print("k :"+k);
		i = j+k;
		print("j+k:"+i);
		
		i = j-k;
		print("j-k;"+i);
		i = k/j;
		print("k/j:"+i);
		i = k*j;
		print("k*j"+i);
		i = k%j;
		print("k%j"+i);
		j %= k;
		print("j % k:"+j);
		//Floating-point number tests
		
		float u,v,w;
		v = rand.nextInt();
		print("v:"+v);
		w = rand.nextFloat();
		print("w"+w);
		u = v+ w;
		print("v+w:"+u);
		u = v-w;
		print("v-w:"+u);
		u = v*w;
		print("v*w:"+u);
		u = v/w;
		print("v/w:"+u);
		u+=v;
		print("u+=v:"+u);
		u-=v;
		print("u-=v:"+u);
		u*=v;
		print("u*=v:"+u);
		u/=v;
		print("u/=v:"+u);
		
		
		
		
		
		
	}
}
