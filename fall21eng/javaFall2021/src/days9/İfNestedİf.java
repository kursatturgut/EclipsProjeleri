package days9;

import java.util.Scanner;

public class �fNested�f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Soru12)Kullan�c�dan 4 basamakli bir sayi girmesini isteyin. Girdi�i sayi 5�e  b�l�n�yorsa son rakam�n� kontrol edin.
		//Son rakam� 0 ise ekrana �5�e b�l�nen  �ift say�� yazd�r�n. 
		//Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.  Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.
		
         Scanner scan=new Scanner(System.in);	
		
		System.out.println("l�tfen 4 basmakl� bir say�  giriniz");
		int say�=scan.nextInt();
		
		if (say�<1000 || say�>9999) {
			System.out.println("4 basmakl� say� grin dedik");
		} else {
                 if (say�%5==0) {
	                      if (say�%10==0) {
						     System.out.println("5 e b�l�nen  �ift say� b�l�n�r");
					}           else {
                                      System.out.println("5 e b�l�nen tek say�");
					}
	
	
	              }else {
System.out.println("l�tfen tekrar deneyin");
}
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
