package day05_matematikseli�lemler;

import java.util.Scanner;

public class yeni�dev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner Scan=new Scanner(System.in);
		
		System.out.println("lutfen 4 basmakl� bi say� giriniz");
		
		int say�=Scan.nextInt();
		//rakamlar toplam�n� yaz 
		//1 yol
	  int ilkRakam=say�%10;
      int ikincirakam=(say�/10)%10;
      int ���nc�Rakam=(say�/100)%10;
      int d�nc�Rakam=(say�/1000)%10;
	System.out.println(ilkRakam+ikincirakam+���nc�Rakam+d�nc�Rakam);	
	System.out.println("ilk say�"+ilkRakam+"\nikinci say�"+ ikincirakam);	
		
	
     
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
