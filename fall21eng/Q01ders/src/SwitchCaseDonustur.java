import java.util.Scanner;

public class SwitchCaseDonustur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// g�n numaras�na g�re g�n isimlerini yazdu�r�l�m
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen g�n numaras�n� griniz");
		
		int gunNo=scan.nextInt();
		
		switch (gunNo) {
		case 1 :
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sal�");
			break;
		case 3 :
			System.out.println("�arsamba");
			break;
		case 4:
		 System.out.println("persembe");	
		 break;	
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("ctesi");
			break;
		case 7 :
			System.out.println("pazar");
			break;
			default:
				System.out.println("l�tfen gecerli bir numara yaz�n�z ");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
