package Day19doWwhileLoop;

import java.util.Scanner;

public class soruwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	oru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam 
//           kac tane olduklarini ekranda yazdirin
	
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("l�tfen say�");
	int say�=scan.nextInt();
	
	
	int adet=0;  // sayac konteynere
	int b�len=1;  // baslang�c degeri
	
	while (b�len<=say�) {
		if (say�%b�len==0) {
			System.out.print(b�len+" ");
		adet++; // adeti art�r
		
		}
		b�len++;  // b�leni d�sarda art�r
		
	}
	System.out.println(); // i� bitince yazd�r 
	System.out.println("tam  say�s�:"+(adet));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
