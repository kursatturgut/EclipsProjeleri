package Day16forloopmuthi�;

import java.util.Scanner;

public class intervievfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Soru 9 ) Interview Question Kullanicidan bir String isteyin.
//Kullanicinin girdigi String�in palindrome olup olmadigini kontrol eden bir program yazin.
		
	//	PAL�DROM
		Scanner scan=new Scanner(System.in);	
		System.out.println("l�tfen kelime ");
		String kelime=scan.next();
		
		
		cag�r(kelime);
		
		System.out.println(cag�r(kelime));
		
		if (kelime.equals(cag�r(kelime))) {
			System.out.println("POL�DROM");
		} else {
System.out.println("de�il");
		}
		
		
		
		}

	private static String cag�r(String kelime) {
		String yeni="";
		for (int i =kelime.length()-1; i >= 0; i--) {
			yeni+=kelime.substring(i, i+1);
		
		
	}

	return yeni;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
