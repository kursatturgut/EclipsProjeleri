package day02;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		// kullan�c�dan isim soy isim ayr� ayr� isteyip 
		// grilen ismi asag�daki gibi yazd�r�n�z 
		// girilen iism :mehmet bulutoz 
		
	Scanner scan= new Scanner(System.in);
	System.out.println("l�tfen isminizi giriniz ...");
			
	String isim =scan.next();
	
	System.out.println("l�tfen soyisminizi giriniz ...");
	
	String soyisim =scan.next();
	
	System.out.println("ismniz ...="+isim+"  soyisminiz..="  +soyisim);

	}

}
