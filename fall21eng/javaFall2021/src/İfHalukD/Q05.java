package �fHalukD;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
      Scanner scan=new Scanner(System.in);
      System.out.println("l�tfen yas�n�z� griniz");
		int yas=scan.nextInt();
		System.out.println("l�tfen kilonuzu griniz");
		int k�lo=scan.nextInt();
		
		if (yas<18) {
			System.out.println("kan bag�s� yapamazss�n�z");
		} else if (k�lo<50) {
			System.out.println("kan bag�s� yapamaz");
		} else {
System.out.println("kan bag�s� yapabilir");
		}{

		}

		
		
		
		
		
		
		
		
		
		
		 
		
		
		
	}

}
