package Day19doWwhileLoop;

import java.util.Scanner;

public class dowhile5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
	 Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde �Sifreniz Kabul edilmistir� yazdirin.
	 - Sifre kucuk harf icermelidir
	 - Sifre buyuk harf icermelidir
	 - Sifre ozel karakter icermelidir
	 - Sifre en az 8 karakter olmalidir.

	R�dvan Adakl�  11:14 PM
	*/
	
	// tek seferde olmas� i�in t�m hatalar� ba�tan s�ylemeli
	
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen sifre giriniz");
	String sifre = "";
	ku�ukharf(sifre, scan);
    boolean a=false;
	System.out.println(a);
	do {
		
		
		System.out.println(a);
		a=false;
	} while (a);
	
	
	
	
	
	
	
	
	
	System.out.println();

}

	private static boolean ku�ukharf(String sifre, Scanner scan) {
		boolean a=false;
		sifre=scan.nextLine();
		String kharf="abcdefgh�ijklmno�pr�tu�vyz";
		for (int i = 0; i <kharf.length()-1; i++) {
			if (sifre.contains(kharf.substring(i, i+1))) {
			 a=true;
			
			} 
		
		}
		
		
		return a;
		
		
	}}
