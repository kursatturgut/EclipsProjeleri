package nestedfor_whileloop;

import java.util.Scanner;

public class soru� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Soru 5 ) Kullanicidan bir sifre etti. 
	 Girilen sifreyi asagidaki sartlara gore kontrol edin 
	 ve sifredeki hatalari yazdirin.
	Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin 
ve gecerli sifre girdiginde "Sifreniz Kabil edilmi�tir" yazdirin.
- Sifre k���k harf icererek
- Sifre buyuk harf icererek
- Sifre ozel karakter icererek
	- Sifre en az 8 karakter olmalidir.
	 */
	
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen �ifre");
	String sifre=scan.nextLine();
	
String  k���kharf="abcdefgh�ijklmno�prs�tu�vyz";
String  buyukharf="ABC�DEFGHI�JKLMNO�PRS�TU�VYZ";	
String  �zel="!+^&%(/)=?_�";
	
for (int i = 0; i < sifre.length(); i++) {
	if (sifre.substring(i).equals(k���kharf.indexOf(i))) {
		
	}


}
	
	
	
	
	
	
	
	
	}

}
