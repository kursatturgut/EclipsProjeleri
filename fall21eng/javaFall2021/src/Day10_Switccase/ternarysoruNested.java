package Day10_Switccase;

import java.util.Scanner;

public class ternarysoruNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		// E�er �al��an kad�nsa 60 ya��ndan b�y�k oldu�unda emekli olabilir
		// �al��an erkekse 65 ya��ndan b�y�kse emekli olabilir.
		

 // scaner olusturmak yerne TEST DATALARINI VAR�ABE OLAARK OLUSTRUP YAZILIM B�TT���NDE DATALARI DE���T�REREK KODLARIMIZI TEST EDEB�L�R�Z 	
	
		char cinsiyet ='K';
    	int   yas=55;	
		
		
		String sonuc =cinsiyet=='K'?     (yas>=60 ? "emeklisin":"de�ilsin"):
			                             (yas>=65? "emeklisin":"degilsin");
		
		
		System.out.println(sonuc);
		
		
		
		
		
	}

}
