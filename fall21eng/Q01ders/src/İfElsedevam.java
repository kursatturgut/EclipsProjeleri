import java.util.Scanner;

public class �fElsedevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
		//birbirine esit ise ekrana �Eskenar ucgen� yazdirin. Diger durumlarda ekrana
		//�Eskenar degil� yazdirin.
		Scanner scan =new Scanner(System.in);
		System.out.println("l�rtefen ��genin \n 1 kenar uzunlu�unu giriniz");
		double kenar1=scan.nextDouble();
		System.out.println("l�rtefen ��genin \n 2 kenar uzunlu�unu giriniz");
		double kenar2=scan.nextDouble();
		System.out.println("l�rtefen ��genin \n 3 kenar uzunlu�unu giriniz");
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("��geniniz eskenar i�gendir");
		} else {
        System.out.println("��geniniz e�siz kenard�r");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
