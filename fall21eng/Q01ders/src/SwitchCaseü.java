import java.util.Scanner;

public class SwitchCase� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen haftan�n ka��nc� g�n�nde oldugunuzu griniz");
		int gun=scan.nextInt();
		
		switch (gun) {
		case 1: {
             System.out.println("pazartesi");			
		break;	
		}
		case 2:{
			System.out.println("sal�");	
			break;
		}case 3:{
			System.out.println("carsamba");	
			break;
		}case 4:{
			System.out.println("persembe");	
			break;
			
		}case 5:{
			System.out.println("cuma");	
			break;
		}case 6:{
			System.out.println("cumartesi");	
			break;
			
		}case 7:{
			System.out.println("pazar");
			break;
		}
			
		default:
			System.out.println("l�tfen gecerli bir say� griniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
