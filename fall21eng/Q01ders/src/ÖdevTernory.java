import java.util.Scanner;

public class �devTernory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
Scanner scan=new Scanner(System.in);
System.out.println("l�tfen bir say� griniz");
int say�=scan.nextInt();

   String sonuc=  (say�>=0) ? (say�<10? "rakam" :"pozitif say�"  )  : "negatif say�"  ; 
System.out.println(sonuc);		
		
	if (say�>=0) {
		   if (say�<10) {
			System.out.println("rakam");
		} else {
System.out.println("pozitif say�");
		}
		
		
		
	} else {
System.out.println("negatif say�");
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
