import java.util.Scanner;

public class �fDevam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Soru 6) Kullanicidan iki sayi isteyin, 
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, 
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
        // sayilarin ikisi farkli isaretlere sahipse �farkli isaretlerde sayilarla islem yapamazsin� yazdirin, 
        // sayilardan sifira esit olan varsa �sifir carpmaya gore yutan elemandir� yazdirin.

Scanner scan=new Scanner(System.in);
double say�1=scan.nextDouble();
double say�2=scan.nextDouble();

if (say�1>0 && say�2>0) {
	System.out.println(say�1+say�2);
} else if (say�1<0  && say�2<0) {
	System.out.println(say�1*say�2);
} else if (say�1<0  && say�2>0 || say�1>0 && say�1<0) {
	System.out.println("i�lem olmaz ");
} else if (say�1==0 || say�2==0) {
	System.out.println("s�f�r yutar");
}{

} {

}{

}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
