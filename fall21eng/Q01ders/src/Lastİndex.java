import java.util.Scanner;

public class Last�ndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
	System.out.println("l�tfen bir c�mla yaz�n�z ");
	String cumle=scan.nextLine().toLowerCase();
	System.out.println("l�tfen bir de harf griniz");
	char harf=scan.next().charAt(0);
	
	
	System.out.println(cumle.lastIndexOf(harf));		
System.out.println(cumle.lastIndexOf("guzel"));
System.out.println(cumle.lastIndexOf("guzel"));			
System.out.println(cumle.length());			
	int ad=cumle.lastIndexOf('a');
	System.out.println(ad);
		
	System.out.println(cumle.lastIndexOf('k'));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
