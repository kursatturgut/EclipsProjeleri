import java.util.Scanner;

public class �devKoordinat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //// Kullan�c�dan ald���n�z koordinat noktas�n�n hangi b�lgede oldu�unu yazd�ran bir kod yaz�n�z
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen koordinat� griniz");
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		if (x>0 && y>0) {
			System.out.println("1 b�lge");
		}
		
		if (x<0 && y>0) {
			System.out.println("2 b�lge");
		}
		
		
		if (x<0 && y<0) {
			System.out.println("3 b�lge");
		}
		if (x>0 && y<0) {
			System.out.println("4 b�lge");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
