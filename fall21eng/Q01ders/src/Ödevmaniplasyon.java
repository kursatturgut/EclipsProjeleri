import java.util.Scanner;

public class �devmaniplasyon {

	public static void main(String[] args) {
// Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

Scanner scan=new Scanner(System.in);

System.out.println("l�tfen ad�n�z� ve soy ad�n��z yaz�n�z");		
		
String name=scan.nextLine();
String surname=scan.nextLine();

int ad=name.length();		
int soyad=surname.length();

	if (ad>soyad) {
		System.out.println("ad daha uzundur");
	} else {
System.out.println("soyad daha uzundur ");
	}	
		
		
		
		
		
		
		
		
	}

}
