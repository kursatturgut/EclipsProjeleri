package �fHalukD;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir karakter griniz");
	//char karakter=scan.	
	    char karakter=scan.next().charAt(0);
	    
	if (karakter>='A' && karakter<='Z') {
		System.out.println("girdi�iniz karakter buyk harftir");
	}else if (karakter>='a'  && karakter<='z') {
		System.out.println("girdi�iniz harf kucuk harftir");
	}else {
		System.out.println("l�tfen gcerli bir karakter griniz");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
