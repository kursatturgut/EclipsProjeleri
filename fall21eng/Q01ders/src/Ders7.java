import java.util.Scanner;

public class Ders7 {

	public static void main(String[] args) {
		// kullan�cdan �k� tam say� al�p 2 tamsay�n�n 4 i�lem sonucunu yazdurunuz 
		
	Scanner scan=new Scanner(System.in);
	System.out.println("brinci tamsay�y� giriniz ");
	int say�1=scan.nextInt();
			System.out.println("ikinci tamsay�y� giriniz ");
	int say�2=scan.nextInt();
					
System.out.println("grilen say�lar�n toplam�:"+(say�1+say�2));
System.out.println("grilen say�lar�n fark�:"+(say�1-say�2));
System.out.println("grilen say�lar�n b�l�m�:"+(say�1/say�2));  //7 double kullanmad��� i�in
System.out.println("grilen say�lar�n toplam�:"+(say�1*say�2));
	
		
		
		
		
		
		
		
		
	}

}
