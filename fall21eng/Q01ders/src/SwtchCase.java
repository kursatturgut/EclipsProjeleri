import java.util.Scanner;

public class SwtchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// g�n numaras�na g�re g�n isimlerini yazdu�r�l�m
		// g�n numaras�na g�re g�n isimlerini yazdu�r�l�m
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen gun numaras�n�z griniz");
		int gunNo=scan.nextInt();
		
		switch (gunNo) {
		case 1 :
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("per�embe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("ctesi");
			break;
		case 7:
			System.out.println("pazar");
			default:
				System.out.println("lurfen gecerli bir numara griniz");
			
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
