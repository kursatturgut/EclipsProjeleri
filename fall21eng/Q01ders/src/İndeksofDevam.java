import java.util.Scanner;

public class �ndeksofDevam {
	public static void main(String[] args) {
		
		/*	Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
	kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin

	- Girilen kelime cumlede kullanilmamis.
	- Girilen kelime cumlede 1 kere kullanilmis.
	- Girilen kelime cumlede 1�den fazla kullanilmis.
*/	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen bir c�mle yaz�n�z ");
		String sentences=scan.nextLine().toUpperCase();
		System.out.println("l�tfen bir kelime ya da harf griniz");
		String caracter=scan.nextLine().toUpperCase();
		
		int indexcaracter=sentences.indexOf(caracter);
		
		if (indexcaracter<0) {
			System.out.println("not use the caracter");
		}else if (indexcaracter>0) {
			System.out.println("the caracter use in the sentences");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
