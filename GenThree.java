/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Arrays;
import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		
		System.out.println(Arrays.stream(new Random().ints(3).toArray()).min());
	}
}
