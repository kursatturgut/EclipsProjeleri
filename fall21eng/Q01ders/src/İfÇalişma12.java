import java.util.Scanner;

public class �f�ali�ma12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		//  gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun

//		isimlerini yazdirin
//		Ornek: ilkHarf=P output = �Pazar, Pazartesi veya Persembe�

//		ilkHarf=S output = �Sali�

	//	*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
        Scanner scan=new Scanner(System.in);
        System.out.println("l�tfen  haftan�n bir g�n�n�n ilk hargini griniz");
		char harf=scan.next().toUpperCase().charAt(0);
		
		if (harf=='P') {
			System.out.println("Pazar,\n Pazartesi \n Persembe�");
		}
		if (harf=='S') {
			System.out.println("sal�");
		}
		if (harf=='C') {
			System.out.println("�arsamba \n cuma\n cumartesi ");
		}
		if(harf != 'P' && harf !=  'S' && harf != 'C'  ) {
			System.out.println("l�tfen do�ru bir harf griniz");
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
