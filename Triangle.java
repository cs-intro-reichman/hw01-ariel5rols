/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
	
		int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]), c = Integer.parseInt(args[2]); // try & catch for user input?
		if ((a + b > c) && (c + a > a) && (c + b > a)) {
			System.out.println("[V] These ints form a triangle!");
		} else {
			System.out.println("[X] These ints do not form a triangle");
		}

	}
}
