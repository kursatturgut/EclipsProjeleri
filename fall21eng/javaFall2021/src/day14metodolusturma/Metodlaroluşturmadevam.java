package day14metodolusturma;

import java.util.Scanner;

public class Metodlarolu�turmadevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kullan�c�dan iki say� isteyelim
		// say�lar� karelerini ve k�plerini toplay�p yazd�ran  iki ayr� metot yaz�n
		// kullan�c�ya us  sorun
		// 2 yazarsa karleri toplam� yapan metod 
		// uc yazarsa kupler toplam�n� yapan metod cal�ss�n 
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfn iki say� griniz\n ikinci say� i�in entere basn�z");
	int say�1=scan.nextInt();
	int say�2 =scan.nextInt();
	System.out.println("l�tfen kare toplam i�in 2 k�p i�in 3 griniz");

	int istek=scan.nextInt();
	switch (istek) {
	case 2:
			karelerToplam�(say�1,say�2);	
		break;
	case 3 :
		k�plerToplam�(say�1,say�2);
		break;
		default:
			System.out.println("l�tfen istene iki gri�i yao�n�z");
	}
		
		
		
		
	}

	public static void k�plerToplam�(int say�1, int say�2) {
		System.out.println((say�1*say�1*say�1)+(say�2*say�2*say�2));
	}

	public static void karelerToplam�(int say�1, int say�2) {
		System.out.println((say�1*say�1)+(say�2*say�2));
	}

	

}
