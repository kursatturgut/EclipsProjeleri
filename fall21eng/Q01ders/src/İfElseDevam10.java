import java.util.Scanner;

public class �fElseDevam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Soru 8) Kullanicidan maas icin bir teklif isteyin 
        //      ve asagidaki degerlere gore cevap azdirin.  
        //      Teklif 80.000�in uzerinde ise �Kabul ediyorum� , 
        //      60 � 80.000 arasinda ise �Konusabiliriz�, 
        //      60.000�nin altinda ise �Maalesef Kabul edemem� yazdirin 
        
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen maa� teklifinizi yaz�n�z ");
		int teklif=scan.nextInt();
			
				if (teklif>=80000) {
					System.out.println("kabul ediyorum");
				} else if (teklif<80000 && teklif>=60000) { // su sekli dah iyi else if (teklif>60000)    bu dha kolay yuardan asag�
					System.out.println("konu�al�m");
				} else {
System.out.println("hay�r");
				} {

				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
