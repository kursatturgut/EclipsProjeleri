package day08;

import java.util.Scanner;

public class �fAl��t�rma9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	* Soru 3) Kullanicidan gun ismini alin ve 
    //* haftaici veya hafta sonu oldugunu yazdirin 
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir g�n griniz:");
		String g�n=scan.next().toUpperCase();
		
		if (g�n.equals("PAZAR") || (g�n.equals("CUMARTES�"))) {
			System.out.println("hafta sonu tatil");
		} else {
System.out.println("HAFTA ��� TATL DE��L");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
