package �fHalukD;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
		 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
		    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
		     
		     ��gen olma sarti :herhangi iki kenar toplami diger kenardan b�y�k, herhangi iki kenar fark� diger kenardan b�y�k olmali
			 a+b>c>a-b
			 a+c>b>a-c  
		     b+c>a>b-c  
			a=b=c ise es kenar ucgen 
			 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir tamsay� griniz");
	    System.out.println("l�tfen bir tam say� dah griniz");
		System.out.println("l�tfen 3. tamsay�n�z� griniz");
		                int say�1=scan.nextInt();
				        int say�2=scan.nextInt();
						int say�3=scan.nextInt();
		if (say�1+say�2>say�3 && say�3>say�1-say�2) {
		       if (say�1+say�3>say�2 && say�2>say�1-say�3) {
				if (say�2+say�3>say�1 && say�1>say�2-say�3) {
					System.out.println("��gendir");
					if (say�1==say�2 &&say�2==say�3) {
						System.out.println("e�kenar ��gen");
					}
				}
			}	
		}else {
			System.out.println("l�tfen ��gen griniz");
		}
		
		
		
		
		
	

				

	}

}
