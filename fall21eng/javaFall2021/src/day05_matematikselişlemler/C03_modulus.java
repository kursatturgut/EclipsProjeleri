package day05_matematikseli�lemler;

import java.util.Scanner;

public class C03_modulus {

	public static void main(String[] args) {
		
		int a=15%4;                                 //modulus kalan verir ve is�areti yuzde i�aretidr
	System.out.println(a);
		
     // kullan�c�dan 3 basmakl� say� alup rakamlar toplam�n� yazd�ran program yaz�n�z 
	    
	 Scanner scan=new Scanner(System.in);
	System.out.println("lutfen 3 basmakl� say� giriniz ");
	int say�=scan.nextInt();
	
	// bulmak istedi�iimz seye degi�ken atar�z baska yolu yok 
	// �nce 3 u bulduk 10 b�lerek 
	
	int rakamlarToplam�=0;
	int rakam=say�%10;
    rakamlarToplam�+=rakam;  // NEDEN BA�INA �NT YAZINCA KABUL ETM�YOR 
    say�/=10;
    
	 rakam=say�%10;
	 rakamlarToplam�+=rakam;
	 say�/=10;
	 
	rakam=say�%10;
	rakamlarToplam�+=rakam;
	say�/=10;
	
	System.out.println(rakamlarToplam�);
	
	
			
	
	
	
	
	
	
	}

}
