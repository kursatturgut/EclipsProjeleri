package day02;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// scanner i�leminde strin i�in iki method vard�r scan.next dedi�inizde tek kelime al�r 
		// dah fazal kelime gelme drumu varsa scan.nextline kullanmal�y�z 
		//

		Scanner scan=new Scanner (System.in);  // nas�l import edlir 
		
		System.out.println("Ad�n�z� yaz�n�z ");
		
		String ad= scan.nextLine();
		
		System.out.println("soyad�n�z�  yaz�n�z ");
				
		String soyad=scan.nextLine();
		
		System.out.println("ad�n�z= "+ad+"soyad="+soyad);
				
		
		
		
		
		
		
		
		
	}

}
