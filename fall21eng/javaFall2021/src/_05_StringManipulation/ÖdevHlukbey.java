package _05_StringManipulation;

import java.util.Scanner;

public class �devHlukbey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  /*

         * Kullan�c�dan ald���n�z  Ad�, Soyad� ve kredi kart� numaralar�n� a�a��daki gibi �zel forma d�n��t�r�n
         * Kredi kart� numaras�n� kontrol edin, yoksa 16 haneden k���k olursa   "Ge�ersiz kredi kart� numaras�" yazd�r�n.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Ad�n ba� harfleri ve soyad� b�y�k olmal�d�r)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */	
		
		kontrol();
		
		
		
		
	}

	public static void kontrol() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen ad�n�z� sosyad�n�z� ve kredi kart� numaranz�� griniz \n ad yazd�ktan sonra enter ve sosyad yazd�ktan smra enter bas�n�z");
		String ad=scan.nextLine();
		String soyad=scan.nextLine();
		String kart=scan.next();
		 if (kart.length()!=16) {
			System.out.println("gecersiz kart no");
		}else {
		System.out.println(ad.toUpperCase().charAt(0)+(ad.replaceAll("\\w", "*")));	
		System.out.println(soyad.toUpperCase().charAt(0)+(ad.replaceAll("\\w", "*")));
		System.out.println(kart.replaceAll("\\w", "*")+(kart.substring(kart.length()-4)));
		}
		
		
		
	}

}
