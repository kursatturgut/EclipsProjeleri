import java.util.Scanner;

public class ders6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("kullan�c�n�n ad� \n soyad� \n yas \n \t kilosu \n");
		
		// kullan�c�n�n ad� soy ad� yas� kilosu alt alta ayzd��rn�z 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("ad�n�z� giriniz:");   // line alt sat�rda al�r  olmazssa �st sat�r print yazar b�rak�san o satara yazar 
		String name=scan.nextLine();             //System.out.print  yazarsan o sat�rda kars�l�k al�rs�n 
		System.out.println("soad�n�z� giriniz:");
		String soyad=scan.nextLine();
		System.out.println("ya��n�z� giriniz:");
		int ya��n�z=scan.nextInt();
		System.out.println("kilonuzu giriniz:");
		int kilonuzu=scan.nextInt();
		System.out.println("boyunuzu giriniz:");
		int boyunuz=scan.nextInt();
		
		System.out.println("benim ad�m:"+name+"\n"+"soyad�m:"+soyad+"\n"+"benim ya��m"+ya��n�z+"kg"+"\n"
		+"benim kilom"+kilonuzu+"\n"+"benim boyum"+boyunuz+"cm");	
		
		
	}

}
