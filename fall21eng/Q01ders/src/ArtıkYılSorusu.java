import java.util.Scanner;

public class Art�kY�lSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// artik yil sorusu

				Scanner scan = new Scanner(System.in);
				System.out.print("L�tfen bir y�l giriniz : ");
				int year = scan.nextInt();
				System.out.println ("   ***   if c�zumu   ***   ");
				if (year % 100 == 0 && year % 400 == 0) {
					System.out.println("Girdi�iniz"+year + " y�l� ARTIK YIL");
				} else if (year % 100 != 0 && year % 4 == 0) {
					System.out.println("Girdi�iniz"+year + " y�l� ARTIK YIL");
				} else {
					System.out.println("Girdi�iniz"+year + " y�l� ARTIK YIL de�ildir.");
				}

				//  ternary cozumu ...
				System.out.println ("   ***   ternary c�zumu   ***   ");

				String result = year % 100 == 0 ? year % 400 == 0 ? "Artik Yil" : "Artik Yil Degil"
						: year % 4 == 0 ? "Artik Yil" : "Artik Yil Degil";
				System.out.println(result);
				

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
