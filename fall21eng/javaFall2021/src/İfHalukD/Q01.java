package �fHalukD;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("l�tfen bir say� griniz");
		double say�1=scan.nextDouble();
		System.out.print("l�tfen bir say� daha griniz");
		double say�2=scan.nextDouble();
		
		System.out.println("toplama i�in -> 1 \n c�karmai�in -> 2 \n carpmama i�in -> 3 \n b�lmei�in -> 4 ");
		// kullan�c�dan veri gelecegi i�in int  atad�m 
		int islem=scan.nextInt();
		
		if (islem==1) {
			System.out.print(say�1+say�2);
		}else if (islem==2) {
			System.out.print(say�1-say�2);
		}else if (islem==3) {
			System.out.print(say�1-say�2);
		}else if (islem==4) {
			System.out.print(say�1/say�2);
		}else {
			System.out.print("hatal� gri� yapt�n�z");
		}
		 
		
		
		
	
	
	
	
	
	}

}
