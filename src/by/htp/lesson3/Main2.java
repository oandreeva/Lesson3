package by.htp.lesson3;

public class Main2 {

	public static void main(String[] args) {
		System.out.println(colors(2, 2, 2));
	}

	private static int colors(int height, int diameter, int consumption/*расход краски*/) {

		double pi = 3.14;
		double top = pi * Math.pow(diameter, 2) / 4; // вычисление площади крышки
														
		double middle = pi * diameter * height; // вычисление площади боков. пов.

		double sum = top + middle; // общая площадь

		double count = sum / consumption; // нецелое кол-во банок
		int result = (int) count; // целое кол-во банок
		int x = (int) (count * 10); // например, мы получили 10.34 банки,
									// умножим на 10, отбросим дробную часть,
									// получим 103
		int rest = x % 10; // разделим на 10 с остатком и в остатке получим 3
		
		if (rest > 0) { // если у нас остаток больше 0, то надо исходное кол-во
						// банок прикастовать к инту и добавить 1
			result++; // увеличиваем на 1
		}
		return result;
	}
}
