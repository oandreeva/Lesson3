package by.htp.lesson3;

public class Main7 {

	public static void main(String[] args) {
		
		int remove = 5;
        int x = 1234567859; // начальное число
        int zero = 10; // делитель
        int a = 0;
        int count = 0;

        for (int i = 0; x > 0; i++) { //цикл выполняется до тех пор, пока res не равен нулю
            int res = x % zero; //делим исходное число на делитель
            x = x / zero;
            if (res != remove) {
                a = a + (int) (res * Math.pow(zero, i - count));
            } else {
                count++;
            }
        }
        System.out.println(a);
		

	}

}
