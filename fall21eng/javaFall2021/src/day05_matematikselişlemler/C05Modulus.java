package day05_matematikseli�lemler;

import java.util.Scanner;

public class C05Modulus {

	public static void main(String[] args) {
		//  kullan�c�dan 6 basamkl� say� al�n ve rkamlar toplam�n� yaz�n 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen 6 haneli bir say� giriniz");
		int say�=scan.nextInt();
		
		int rakamlarToplam�=0;  // neden int olmadan kabul etmiyor 
		int rakam=say�%10;
		rakamlarToplam�+=rakam;      // neden ba��na int giremiyoruz 
		say�/=10;
		
	    rakam=say�%10;
	    rakamlarToplam�+=rakam;
	    say�/=10;
	    
	    
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
