import java.util.Scanner;

public class �fAl��t�rmadDevam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
        //          eger uc kenar uzunlugu birbirine esit ise ekrana �Eskenar ucgen� yazdirin. 
        //          Diger durumlarda ekrana  �Eskenar degil� yazdirin.
        
		Scanner scan=new Scanner(System.in);
		System.out.println("��genin kenar uzunluklar�n� s�ras�ya griniz");
		double kenar1=scan.nextDouble();
				double kenar2=scan.nextDouble();
						double kenar3=scan.nextDouble();
						
		if (kenar1==kenar2 &&  kenar1==kenar3) {
			System.out.println("e�kenar u�gen");
		} else {
System.out.println("mot e�kenar");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
