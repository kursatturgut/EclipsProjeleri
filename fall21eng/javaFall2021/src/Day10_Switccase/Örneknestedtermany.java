package Day10_Switccase;

public class �rneknestedtermany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru2 : Kullanicidan bir harf isteyin
				// kucuk harf ise consola �Kucuk Harf� ,
				// buyuk harfse consola �Buyuk Harf�
				// yoksa �girdiginiz karakter harf degil� yazdirin.
		
		
		char karakter='s';
		
		String sonuc= (karakter>='a' && karakter<='z')? "k���k harf":( (karakter>='A'&& karakter<='Z')? "b�y�k harf":"karakter de�ildir" );
		
		
		System.out.println(sonuc);
		
		
		
		
		
		
		
		
		
		
		
	}

}
