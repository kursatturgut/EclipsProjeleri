package day13stringmanupuluendwith;

import java.util.Scanner;

public class StrartswithEndvith {

	public static void main(String[] args) {
		// Kullan�c�dan c�mle ve kelime al�n 
		// verilen cumlenin  verilen kelime ile baslay�p baslmad�g�n� 
		// btip bitmedi�ini yazd�r�n

	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen bir c�mle");
	String cumle=scan.nextLine();
	System.out.println("kelime");
		String kel=scan.next();
		
		
System.out.println(cumle.startsWith("kel"));
System.out.println(cumle.endsWith("kel"));		
		
		if (cumle.startsWith(kel)) {
			System.out.println("basl�yor");
		} else {
System.out.println("baslam�yor");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
