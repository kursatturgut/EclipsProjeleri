package day08;

import java.util.Scanner;

public class �fElse�f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini 
		//yazdirin, sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere 
		//sahipse �farkli isaretlerde sayilarla islem yapamazsin� yazdirin, sayilardan sifira esit olan varsa
		//�sifir carpmaya gore yutan elemandir� yazdirin.
		
		
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("l�tfen 1.say�y� grin");
			
			double say�1=scan.nextDouble();
		
			System.out.println("l�tfen 2.say�y� grin");

			double say�2=scan.nextDouble();
		
		if (say�1>0 && say�2>0) {
			System.out.println("say�lar�n toplam� :"+ (say�1+say�2));
		} else  if(say�1<0 && say�2<0) {                                                                 //else 
			System.out.println("say�lar�n �arp�m� :"+ say�1*say�2);
		}  else if (say�1*say�2<0){
			System.out.println("farkl� i�aretlerde i�lem yapamazss�n");
		}else {
			System.out.println("s�f�r �arpmaya g�re yutan elmand�r ");
		}
		
		
		
		
		
		
		
	}

}
