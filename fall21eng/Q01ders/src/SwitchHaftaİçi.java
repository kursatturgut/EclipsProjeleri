import java.util.Scanner;

public class SwitchHafta��i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen gun ismini griniz");
		
		String gun=scan.next().toLowerCase();
		
		switch (gun) {
		case "pazartesi":
		case "sal�":
		case "�ar�amba":
		case "per�embe":
		case "cuma":
			System.out.println("haftai�i");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("haftasonu");
			break;
		default:
			System.out.println("l�tfen dogru gun griniz");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
