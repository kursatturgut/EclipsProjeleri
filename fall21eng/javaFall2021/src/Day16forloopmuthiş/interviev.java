package Day16forloopmuthi�;

import java.util.Scanner;

public class interviev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	oru 6) Interview Question Kullanicidan 100�den kucuk bir tamsayi isteyin. 
	//	1�den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
	//	 - Sayi 3�un kati ise sayi yerine �Java� yazdirin.
	//	 - Sayi 5�in kati ise sayi yerine �Guzeldir� yazdirin.
	//	 - Sayi hem 3�un hem 5�in kati ise sayi yerine �Java Guzeldir� yazdirin.
		
		Scanner scan=new Scanner(System.in);	
		System.out.println("l�tfen 100 den k���k say�");
		int say�=scan.nextInt();
		
		
		for (int i = 1; i < say�; i++) {
			
		if (i%3==0 && say�%5==0) {
			System.out.println("java g�zeldir");
		} else if (i%3==0) {
			System.out.println("java");
		} else if (i%5==0) {
			System.out.println("g�zeldir");
		} else {
System.out.println(i);
		}
		
		// EN DAR OLANDAN BASLAMAK �OK �NEML� �NCE ONU HALED�P DEVAMI 
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
