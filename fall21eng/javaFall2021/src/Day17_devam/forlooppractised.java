package Day17_devam;

import java.util.Scanner;

public class forlooppractised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Soru 10 ) Kullanicidan iki sayi isteyin. 
		 Girilen sayilar ve aralarindaki tum tamsayilari toplayip, 
		 sonucu yazdiran bir program yaziniz

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen iki say� griniz 1 say�dan sonra enter yap�n�z ");
	     int say�1=scan.nextInt();
	     int say�2=scan.nextInt();
	     int kucuk;
	     int buyuk;
	     
	if (say�1<say�2) {
		kucuk=say�1;
		buyuk=say�2;
				
	} else {
       buyuk=say�1;
       kucuk=say�2;
	}
	     int toplam=0;
	     
	     for (int i = kucuk; i <= buyuk; i++) {
		toplam+=i;
	}
	System.out.println(toplam);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
