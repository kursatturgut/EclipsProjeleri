package Day16forloopmuthi�;

import java.util.Scanner;

public class devamllll {

	public static void main(String[] args) {
		

	// Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.
		
		Scanner scan=new Scanner(System.in);	
		System.out.println("l�tfen kelime ");
		String kelime=scan.next();
		
		
		cag�r(kelime);
		
		System.out.println(cag�r(kelime));
		
		
		
		}

	private static String cag�r(String kelime) {
		String yeni="";
		for (int i =kelime.length()-1; i >= 0; i--) {
			yeni+=kelime.substring(i, i+1);
		
		
	}

	return yeni;
		
		
	}

}
