import java.util.Scanner;

public class �fBasamak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullan�c�dan bir pozitif tamsay� girmesini isteyin, o pozitif tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
        // 3 basamakl� degilse �ift olup olmadigini kontrol edin. �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
        // �ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen pozitif bir say� griniz");
		int say�=scan.nextInt();
		
		if (say�>=100 && say�<1000) {
			System.out.println("�� basamakl�");
		} else if (say�%2==0) {
			System.out.println("�� basmakl� olmayan �ift say�");
		} else {
System.out.println("�� basmakl� olmayan tek say�");
		}{

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
