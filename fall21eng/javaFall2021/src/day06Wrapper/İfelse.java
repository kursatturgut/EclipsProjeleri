package day06Wrapper;

import java.util.Scanner;

public class �felse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// e�er (hava g�zl olursa) {pikni�e gideriz} alt sat�ra gecer 
	//	if (boolen sart)  {sart ok se istene  kod �al���r} alt sat�r 
		/*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = �Pazar, Pazartesi veya Persembe�             
            ilkHarf=S output = �Sali�
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
	
	Scanner scan=new Scanner(System.in);
	System.out.println(" l�tfen g�n isimlerinden brinin ilk harfini giriniz:");
	
	char ilkHarf=scan.next().charAt(0);
	
	if (ilkHarf=='P') {
		System.out.println("Pazar,pazartesi veya Pe�embe:");
	}
	if (ilkHarf=='C') {
		System.out.println("cuma,cumartesi veya �ar�amba:");
	}
	if (ilkHarf=='S') {
		System.out.println("Sal�:");
	}
	
	
	
	
	
	
	
	
	
	}

}
