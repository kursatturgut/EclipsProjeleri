package day05_matematikseli�lemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		
		// kullan�c�dan 4 basmakl� say� al�p rakmlar toplam�n� yazd�r�n 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen 4 haneli say� giriniz");
		
	      int say�=scan.nextInt();
	      
	     int rakamlarToplam�=0;
	     int  rakam=say�%10;
	     rakamlarToplam�+=rakam;  // neden int yazam�yoruz 
	     say�/=10;
	     
	     rakam=say�%10;  // neden int kabul etmiyor ba��na 
	     rakamlarToplam�+=rakam;
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
