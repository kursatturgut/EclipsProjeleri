package _05_StringManipulation;

import java.util.Scanner;

public class HalukBeyccc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // Kullan�c�dan tek seferde alaca��n�z 2 kelimelik ad soyad� 2 ayr� kelimeye ay�r�n�z,
  // ad ayr� soyad ayr� sekilde ekrana yazd�r�n�z.
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("l�tfen ad�n�z� soyad�n�z� griniz");	
	String ad=scan.nextLine();
	
	System.out.println(ad.substring(0,ad.indexOf(" ")));	
	System.out.println(ad.substring(ad.indexOf(" ")+1));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
