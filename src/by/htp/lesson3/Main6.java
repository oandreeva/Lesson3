package by.htp.lesson3;

public class Main6 {

	public static void main(String[] args) {
		 int year = 1900;
		 int vis = 366;
		 int nevis = 365;
		 if (year%4!=0){
			 System.out.println("1 " +nevis);
		 }else {
			 if (year%100!=0){
				 System.out.println("2 " +vis);
			 }else {
				 if (year%400!=0){
					 System.out.println("3 " +nevis);
				 }else {
					 System.out.println("4 " +vis);
				 }
			 }
		 }

	}

}
