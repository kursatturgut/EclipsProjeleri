package day02;

import java.util.Scanner;

public class C04_Scaner {

	public static void main(String[] args) {
		
		
		// kullan�c�dan deger almak i�in 3 ad�m takip edilir 
		// 1  scanner objesi olu�turmak 
		
		Scanner scan=new Scanner(System.in);  // obje olu�turduk 
		
		// ikinci ad�m kullan�c�yaiste�iimiiz s�ylemek 
		
		System.out.println("L�tfen isminizi yaz�n�z");  // istedik 
		
		String isim=scan.next();
				
		System.out.println("isminiz..:"+isim);
		
		
		scan.close();
		
		
		
		
		
		//scan  bir scanner objesidir 
		// isim olarak farkl� bir isim yazssak ta �al��r ama scan tercih edilir 
		// scan  bir obje oldu�u i�in data t�r� non primitive dir 
		// primitiva data turleri sadece de�er i�errken non primitive de�erin yan�nda method bar�nd�r�lar 
		// scan .  dedi�imizde hazur metodlar� g�rebiliriz 
	
		
		
		
		
		
		
		

	}

}
