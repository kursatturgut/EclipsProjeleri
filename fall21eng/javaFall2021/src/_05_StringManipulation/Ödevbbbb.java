package _05_StringManipulation;

import java.util.Scanner;

public class �devbbbb {

	public static void main(String[] args) {
		 //Kullan�c�dan alaca��n�z, 3 kelimeden olu�an ismi
        // �rn. Ahmet Emin Y�lmaz -> A.E.Y.  format�yla yazd�r�n�z.	
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen 3 kelimelik isminiiz yaz�n�z ");
		String isim=scan.nextLine();
		
		System.out.println(isim.charAt(0)+"."+(isim.charAt(isim.indexOf(" ")+1)+"."+isim.charAt(isim.lastIndexOf(" ")+1))+".");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
