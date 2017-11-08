/**
 * 
 */
package by.htp.lesson3;

/**
 * @author op
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int rnd = random(900);
		System.out.println("rnd =" + rnd);

		int x = rnd / 100;
		int y = (rnd / 10) % 10;
		int z = rnd % 10;

		int sum = x + y + z;
		int mlt = x * y * z;

		System.out.println("sum = " + sum + " mlt = " + mlt);
	}

	public static int random(final int max) {
		return (int) (Math.random() * max) + 100;
	}
}
