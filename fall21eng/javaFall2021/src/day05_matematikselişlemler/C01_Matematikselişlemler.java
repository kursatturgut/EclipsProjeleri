package day05_matematikseli�lemler;

public class C01_Matematikseli�lemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(4*(2+5)/2);  // i�lem s�ras� 
		
		System.out.println(4*(2+5)/3); // 9 verdi  i�lem yap�lan say�lar int data t�r� oldu�u i�in virg�l yazmad� int cinsinden c�kt� 
		// sonucu virg�ll� olsun istersek 
		
		double sonu�=4*(2+5)/3;
		System.out.println(sonu�);  //9.3  g�stermedi  9.0 ��kt� because de�eri bulur assing eder de�eri 9 bulur 9 u doouble yap dersen 9.0 yazar 
		// �nce sonucu buldu sonra atam yapt� 
		
		
		
		 sonu�=(double)4*(2+5)/3; //  burda 4 � double tan�mlad�k sonu� de�i�ti 
         sonu�=4.0*(2+5)/3;
         System.out.println(sonu�); // genelde kullan�c�dan deger ald���m�z i�in onu de�i�emeyiz ama onu double diye tanmlaya biliriz 
         
         int say�1=5;
         int say�2=2;
         double say�3=2;
         System.out.println(say�1/say�2);// sonuc int tamsay� 5/2 =2
         System.out.println(say�1/say�3);// 5/2   =2.5  say�n�n bri double oldu�u i�in sonu� double 
         
         
        		 
        		 
         
         
         
	}

}
