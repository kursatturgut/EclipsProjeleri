package day06Wrapper;

import java.util.Scanner;

public class Basit�fc�mleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin                              // bu sayfay� g�zden ge�ir
            Ornek:      gun=Pazar output = �Hafta sonu�
                        gun=Sali output = �Hafta ici�
         *** String icin equals method�unu kullanin
         */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen g�n ismini yaz�n�z :");
		String gun=scan.next().toLowerCase();
		
	if (gun.equals("pazar") || gun.equals("cumartesi")  ) {
		
		System.out.println("haftasonu");
	}
		
//if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("�arsamba" || gun.equals("per�embe") ) {
		
		System.out.println("haftasonu");
	}
		
		
		
		
		
		
		
		
		
	}


