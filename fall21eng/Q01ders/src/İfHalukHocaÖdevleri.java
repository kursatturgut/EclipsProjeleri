import java.util.Scanner;

public class �fHalukHoca�devleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen 1. say�y� griniz ");
		double say�1=scan.nextDouble();
		System.out.println("lutfen 2. say�y� griniz");
		double say�2=scan.nextDouble();
		System.out.println("i�lemler i�in bas�lacak numaraalr :\n toplama i�in 1 \n ��karma i�in 2 \n b�lme i�in 3\n �arpa i�in 4  ");
		int i�lem=scan.nextInt();
		
		if (i�lem==1) {
			System.out.println(say�1+say�2);
		}if (i�lem==2) {
			System.out.println(say�1-say�2);
		}if (i�lem==3) {
			System.out.println(say�1/say�2);
		}if (i�lem==4) {
			System.out.println(say�1*say�2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
