package _05_StringManipulation;

import java.util.Scanner;

public class jjjjjjjjjj {

	private static final String String = null;

	public static void main(String[] args) {
		
		/*
		StringMethods:
		cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    ORNEK:
     	INPUT      :  Python
		OUTPUT :   Pyt
*/
		
		String ilkyar�=null;
		
		
		zuznluk(ilkyar� );
		
		
		
	
		
	}

	private static void zuznluk(java.lang.String ilkyar�) {
		
		
		
	Scanner scan=new Scanner(System.in);
	System.out.println("�ift uuznlukta bir degi�ken griniz");
		String uzun=scan.next();
		
if (uzun.length()%2==0) {
	System.out.println(uzun.charAt(0)+uzun.substring(uzun.length()/uzun.length(),uzun.length()/2));	
			
		}else  {
			System.out.println("l�tfen cift uzunlukta kelime griniz");
		}
		
		
	}

	

	

}
