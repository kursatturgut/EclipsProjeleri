package day08;

import java.util.Scanner;

public class ifelse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//// Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		//			eger uc kenar uzunlugu birbirine esit ise ekrana �Eskenar ucgen� yazdirin.
		//			Diger durumlarda ekrana  �Eskenar degil� yazdirin.
       Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen ��genin 1. kenar�n� grin");
		
		double kenar1=scan.nextDouble();
			
System.out.println("l�tfen ��genin 2. kenar�n� grin");
		
		double kenar2=scan.nextDouble();
		
System.out.println("l�tfen ��genin 3. kenar�n� grin");
		
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("e�kenar ��gen");
		} else {
System.out.println("esknar ��gen de�il");
		}
		
	//  haytta iki secenek varsa if else 
		// ikiden fazla seceknek oldugunda ise 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
