package Day15metodcretion;

import java.util.Scanner;

public class Metodsorular�2 {

	public static void main(String[] args) {
		/*
		Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve
sayilarin toplamini yazdirin. Kullanici toplamak istedigi sayi adedini
4�den buyuk girerse �Cok sayi girdiniz, ben toplayamam� yazdirin.
*/  
		Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen \n 2 say� toplamk i�in 2 \n 3 say� toplamk i�in 3 \n 4 say� tplamak i�in 4 ");
	int tercih=scan.nextInt();
	
	switch (tercih) {
	
	case 2:
		ikiTopla();
	break;
	case 3:
		ucTopla();
		break;
	case 4:
		dortTopla();
		break;
	default :
		System.out.println("l�tfen gecerli say� griniz ");
	
	
		}
		
		
		
		
	}

	private static void dortTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen 4 say� griniz her say�dan ssonra entere bas�n�z sonraki say�y� grinz");
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		double say�3=scan.nextDouble();
		double say�4=scan.nextDouble();
		System.out.println(say�1+say�2+say�3);
		
	}

	private static void ucTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen 3 say� griniz her say�dan ssonra entere bas�n�z sonraki say�y� grinz");
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		double say�3=scan.nextDouble();
		System.out.println(say�1+say�2+say�3);
		
	}

	private static void ikiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen iki say� griniz ilk say�dan ssonra entere bas�n�z ikinci say�y� grinz");
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		System.out.println(say�1+say�2);
	}

}
