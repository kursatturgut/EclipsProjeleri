package nestedfor_whileloop;

import java.util.Scanner;

public class whileLoophadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // kullan�c�dan toplanmak �zere say�lar isteyin b
		// say� adedi 10 u gecerse veya toplam 500 u gecerse 
	// bu kadar say� yeter 
		// ... adet say� girdin toplam� yazd�r�n 
		Scanner scan=new Scanner(System.in);
		
	int say�=0;
	int adet=0;
	int toplam=0;
	
	while(!(adet>10) && !(toplam>=500)) {
		System.out.println("l�tfen toplamk istedi�iniz say�lar� griniz");
		say�=scan.nextInt();
		toplam+=say�;
		adet+=1;
		
		
		
	}
	System.out.println(adet);
	System.out.println(toplam);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
