package day02;

import java.util.Scanner;

public class day2�dev {

	public static void main(String[] args) {
	   
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir tam say� giriniz");
		
		int say�=scan.nextInt();

		System.out.println("bir tam say�daha giriniz");
	
		int say�2=scan.nextInt();
	
		System.out.println(say�+say�2);
		System.out.println(say�-say�2);
		System.out.println(say�*say�2);
		
		System.out.println("karenin bir kenar uzunlu�unu giriniz");
		
		int kenar1=scan.nextInt();
		
		System.out.println(4 * kenar1);
		
		System.out.println("�emberin yar� �ap�n� griniz ");
		
		int �emberyar��ap=scan.nextInt();
		
		System.out.println("�ember �evre ="+ �emberyar��ap*2*3);
		
		System.out.println("�ember alan ="+ �emberyar��ap*�emberyar��ap*3);
				
		
		
		
		
		
	}
	
	
	
	

}
