import java.util.Scanner;

public class �fG�nler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen haftan�n bir g�n�nn ilk harfini giriniz");
		
		char g�n=scan.next().toLowerCase().charAt(0);
		
		if (g�n=='p') {
			System.out.println("pazartesi"+"\n"+"per�embe"+"\n"+"pazar");
		}
		if (g�n=='s') {
			System.out.println("sal�");
		}
		if (g�n=='c') {
			System.out.println("cuma , CUMARTES�");
		}
		if (g�n=='�') {
			System.out.println("�ar�amba");
		}
		
		//tum harfleri k���k kabul et dedim bunu diyerek kullan�c� gri�i ne olursa olsun ilk harfi k���k yapacak
		if (g�n!='c' && g�n!='s' && g�n!='p'&& g�n!='�'  ) {
			System.out.println("l�tfen g�n isimlerinden birinin ba� harfini giriniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
