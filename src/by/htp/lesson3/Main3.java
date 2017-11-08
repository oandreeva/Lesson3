package by.htp.lesson3;

public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abcd = 1234, a, b, c, d;

		a = abcd / 1000;
		b = abcd / 100 % 10;
		c = abcd / 10 % 10;
		d = abcd % 10;
		int result = (a * b) + (c * d);
		System.out.println(result);
	}
}
