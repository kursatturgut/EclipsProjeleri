import java.util.Scanner;

public class �f�13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kullanicidan bir gun alin eger gun �Cuma� ise ekrana �Muslumanlar icin kutsal
		//gun� yazdirin. �Cumartesi� ise ekrana �Yahudiler icin kutsal gun� yazdirin. �Pazar�
		//ise ekrana �Hiristiyanlar icin kutsal gun� yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir g�n ismi griniz:");
		String gun=scan.next().toUpperCase();
		
		
		if (gun.equals("CUMA")) {
			System.out.println("M�SL�MANLAR ���N KUTASALDIR");
		}
		
		if (gun.equals("CUMARTES�")) {
			System.out.println("yahudiler i�in kutsald�r ");
		}
		
		if (gun.equals("PAZAR")) {
			System.out.println("hristiyanlar i�in kutsald�r");
		}
		if (gun !="CUMA" && gun != "CUMARTES�" && gun != "PAZAR") {
			System.out.println("normal bir g�nd�r");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
