package statepattern;

import java.util.Random;

public class RandomUtil {
	
	public static Random r = new Random();
	
	public static boolean isLucky(){
		if (r.nextInt(100) < 10){
			return true;
		}
		return false;
	}
}
