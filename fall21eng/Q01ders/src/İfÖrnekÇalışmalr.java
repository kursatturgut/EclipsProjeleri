import java.util.Scanner;

public class �f�rnek�al��malr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = �Pazar, Pazartesi veya Persembe�             
            ilkHarf=S output = �Sali�
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("l�tfen herhangi bir g�n�n ilk hrfini griniz harf giriniz");
		
		char harf=scan.next().toUpperCase().charAt(0);
		
		
		if (harf=='P' || harf=='C' || harf=='S' || harf =='�') {
			if (harf=='P') {
				System.out.println("pazartesi,pazar,per�embe");
			}
			if (harf=='C') {
				System.out.println("cuma");
			}
			if (harf=='S' ) {
				System.out.println("sal�");
			}
			if (harf =='�') {
			System.out.println("�ar�amba");	
			}
			
			
			
			
		} else {
System.out.println("l�tfen ge�erli bir harf griniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
