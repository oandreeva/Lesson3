package by.htp.lesson3;

public class Main5 {

	public static void main(String[] args) {

		int x = -333;
		String result;
		if (x / 1000 != 0) {
			result = "четырехзначное ";
		} else if (x / 100 != 0) {
			result = "трехзначное ";
		} else if (x / 10 != 0) {
			result = "двухзначное ";
		} else {
			result = "однозначное ";
		}

		if (x == 0) {
			result = result + "ноль";
		} else if (x < 0) {
			result = result + "отрицательное";
		} else {
			result = result + "положительное";
		}
		System.out.println(result);
	}

}
