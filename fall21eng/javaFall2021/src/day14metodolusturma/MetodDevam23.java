package day14metodolusturma;

import java.util.Scanner;

public class MetodDevam23 {

	public static void main(String[] args) {
		
		// kullan�c�dan iki say� isteyelim
				// say�lar� karelerini ve k�plerini toplay�p yazd�ran  iki ayr� metot yaz�n
				// kullan�c�ya us  sorun
				// 2 yazarsa karleri toplam� yapan metod 
				// uc yazarsa kupler toplam�n� yapan metod cal�ss�n 
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen iki say� griniz\n ilk say�dan ssonra entere bas�n");
		
		double say�1=scan.nextDouble();
		double say�2 =scan.nextDouble();
		System.out.println("girilen sy�lar�n kareler top i�in 2 \n k�ptp i�in 3 bas�n");
		int secim=scan.nextInt();
		
		// kareTopla(say�1,say�2);	 // cag�rmamamgerek yok sildim
		// kupTopla(say�1,say�2);  // iht�yac kalmad� sil
		switch (secim) {
		case 2:
			kareTopla(say�1,say�2);
		break;
		case 3:
			kupTopla(say�1,say�2);
		break;
			default:
				System.out.println("l�tfen do�ru tercih yap�n");
		
		}
		
		
		}

	public static void kupTopla(double say�1, double say�2) {
		double kuplerToplam�=say�1*say�1*say�1+say�2*say�2*say�2;
		System.out.println("kuptoplam�="+ kuplerToplam�);
	}

	public static void kareTopla(double say�3, double say�4) { // say�lar degi�ir �nemli degil
		double karelerToplam�=say�3*say�3+say�4*say�4;
		System.out.println("karetop="+karelerToplam�);
	}

}
