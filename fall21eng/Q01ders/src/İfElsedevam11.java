import java.util.Scanner;

public class �fElsedevam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
        // calisan erkekse 65 yasindan buyukse emekli olabilir
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen cinsiyetinizi giriniz \n l�tfen yas�n�z� giriniz");
		
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		int  yas=scan.nextInt();
		
		if (cinsiyet!='K' && cinsiyet != 'E') {
			System.out.println("l�tfen kad�n ya da erkek griniz");
		}
		if (cinsiyet=='K') {
			   if (yas>60) {
				System.out.println("emekli olabilirasiniz");
			} else {
System.out.println("emekli olamazss�n�z");
			} 
			
			
				} else if (cinsiyet=='E') {
			       if (yas>65) {
					System.out.println("emekli olabilirsiniz");
				} else {
System.out.println(" emekli olamazss�n�z ");
				}
			
			
			
			
			
			
			
		} {

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
