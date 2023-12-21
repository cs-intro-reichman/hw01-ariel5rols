/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Arrays;
import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		Random random = new Random();
		int lower_limit = Integer.parseInt(args[0]);
		int upper_limit = Integer.parseInt(args[1]);
		
        int a = random.nextInt(upper_limit - lower_limit) + lower_limit;
		System.out.println(a);
		int b = random.nextInt(upper_limit - lower_limit) + lower_limit;
		System.out.println(b);
		int c = random.nextInt(upper_limit - lower_limit) + lower_limit;
		System.out.println(c);

		int min = Math.min(Math.min(a, b), c);
		System.out.println("The minimal generated number was " + min);
	}
}
