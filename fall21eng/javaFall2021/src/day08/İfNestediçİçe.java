package day08;

import java.util.Scanner;

public class �fNestedi���e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
        // calisan erkekse 65 yasindan buyukse emekli olabilir
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen cinsiyetinizi giriniz:erkek i�in  :E   ;  kad�n i�in:K");
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println("l�tfen ya��n�z� giriniz");
		double yas=scan.nextDouble();
		
		if (cinsiyet=='E') {
		          if (yas>=65) {
			System.out.println("emeklisiniz");
		}       else {
System.out.println("emekli olamazs�n�z");
		}
			
			
		} else if(cinsiyet=='K') {
               if (yas>=60) {
	System.out.println("emeklisiniz");
}              else {
System.out.println("emekli de�ilsiniz");
}
			
			
			
		}else {
			System.out.println("l�tfen gecerli bir cinsiyet giriniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
