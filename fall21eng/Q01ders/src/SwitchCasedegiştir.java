import java.util.Scanner;

public class SwitchCasedegi�tir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// gunleri yazd�r�n
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen g�n bir g�n numaras� griniz griniz");
		int gun=scan.nextInt();
	
		
		
		switch (gun)  {
		
		case 1:
			System.out.println("pazartesi pazar per�embe");
			break;
		case 2:
			System.out.println("sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("cuma");
		break;
		
		default :
			System.out.println("lutfen gecerli griniz");
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
