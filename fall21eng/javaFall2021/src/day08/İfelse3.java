package day08;

import java.util.Scanner;

public class �felse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Soru 3) Kullaniciya yasini sorun, eger yas 65�den kucuk ise �emekli olamazsin, calismalisin�, 
		//65�den buyukse �Emekli olabilirsin� yazdirin
		
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen ya��n�z� giriniz");
		
		int yas=scan.nextInt();
		
		if (yas>=65) {
			System.out.println("emeklisin");
		} else {
			System.out.println("emekli  olamazss�n");
		}	
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
