package by.htp.lesson3;

public class Main10 {

	public static void main(String[] args) {
		int[] myList = { 19, 29, 34, 35 };

		int max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
					}
		double[] newList = new double[myList.length];
		for (int i = 0; i < myList.length; i++) {
			newList[i] = (double) myList[i] / max;
		}

		System.out.print("Новый массив = ");
		for (double d : newList) {
			System.out.print(d + ", ");
		}
	}

}