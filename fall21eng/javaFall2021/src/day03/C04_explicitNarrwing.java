package day03;

public class C04_explicitNarrwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int say�1 =140;
			
		short say�2=(short) say�1;
		
		// e�itli�in sag� ve solu farkl� ise jawa mssmatch hatas� verir 
		// jawa uyar�r illa yapacaksan yap diyor
		// otomatik kabul etmez sorumlulugu sen al der 
		
		
		System.out.println(say�2);
		
		
		byte say�3=(byte) say�2;
		
		System.out.println(say�3);
		
		
		double say�4=87.3;
		int say�5=(int) say�4;
		System.out.println(say�5); // say�y� budayarak verdi geri data kayb� oldu de�i�ti 
		
		
		int say�6=27;
		int say�7=4;
		
		System.out.println(say�6/say�7);//  iki say�da int oldu�u i�in jawa sonucu int olarak yazar alg�lar tan�mlaar ve 6 olarak atra 
		double say�8=4;
		System.out.println(say�6/say�8); // i�lem yap�lan say�lardan geni� olna double oldu�u i�in sonucu double verdi  6,75
		
		

		
		
		
		
		
		
		
		
	}

}
