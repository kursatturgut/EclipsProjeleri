package _05_StringManipulation;

import java.util.Scanner;

public class �dev3456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
	       kullan�c�dan bir e-posta adresi girmesini isteyin, ard�ndan "hotmail" i�eriyorsa, "gmail" ile de�i�tirin,
	        �rne�in: johnbrown@hotmail.com ==> johnbrown@gmail.com
	        */
		
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen mail adresinzi griniz");
	String mail=scan.next();
	
	if (mail.contains("@hotmail")) {
		         System.out.println(mail.replace("@hotmail", "@gmail"));
	} else {
System.out.println(mail);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
