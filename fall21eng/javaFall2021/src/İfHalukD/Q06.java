package �fHalukD;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       
    	 //// Kullan�c�dan ald���n�z koordinat noktas�n�n hangi b�lgede oldu�unu yazd�ran bir kod yaz�n�z.
Scanner scan=new Scanner(System.in);
System.out.println("l�tfen bulundugunuz paralelei yaz�n�z ");
System.out.println("l�tfen blundu�unuz meridyeni yaz�n�z");       
    	int paralel=scan.nextInt();
    	int meridyen=scan.nextInt();
    	
    	if (paralel>90) {
			System.out.println("kuzey yar�mkuredesiniz");
			
			
		}else if (paralel==90) {
			System.out.println("ekvatordas�n�z");
		} else {
			System.out.println("guney yar�m kuredesiniz");
		} 
    	
    	
    }
}
