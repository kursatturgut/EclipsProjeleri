package Day10_Switccase;

import java.util.Locale;

public class StringMnupulelowe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// verilen stringi buyuk ya da kucuk harfe ceviri 
		String isim ="ali"; // aL� olarak yazd�ral�m
		System.out.println(""+isim.toUpperCase().charAt(0)+
				           isim.toLowerCase().charAt(1)+
				           isim.toLowerCase().charAt(2));  // bas�na hi�lik koymal�y�z 
		
		
		// turk�e lokal harfler kullanarak tamam�n� ku�uk harfe cevirelim
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));  // dili de�i�tirdi.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
