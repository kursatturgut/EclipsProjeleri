package Day17_devam;

import java.util.Scanner;

public class forpractic {

	public static void main(String[] args) {
		// T
		// Soru 11 ) Interview Question Kullanicidan 10�dan kucuk bir  tamsayi isteyin
        //           ve girilen sayinin faktoryel�ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen 10dan k���k tamsya� giriniz");
		int say�=scan.nextInt();
		
		
		
		int fak=1;
		
		for (int i = say�; i > 0; i--) {
		
			
			fak*=i;
			
			
			
			
			
			
			
			
			
			
			
		}
		
		System.out.println("istenen say�n�n fakt�riyeli="+fak);
		
		
		
		
		
		
		
		
		
		
		
	}

}
