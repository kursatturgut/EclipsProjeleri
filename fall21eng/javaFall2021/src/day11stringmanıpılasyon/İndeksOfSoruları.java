package day11stringman�p�lasyon;

import java.util.Scanner;

public class �ndeksOfSorular� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Kullanicidan bir cumle ve bir harf isteyin,
  //  harfin cumlede var olup olmadigini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir c�mle griniz");
		String cumle=scan.nextLine();
		System.out.println("l�tfen varl���n� kontrol etmek i�in bir harf grin");
		char krk=scan.next().charAt(0);
		
		int index=cumle.indexOf(krk);   // girilen karakterin c�mledeki indexsini verir -1 c�ksa indek c�mlede yok demek 
		
		if (index<0) {  // index == -1  de olur du.
			System.out.println("girdi�iniz harf c�mlede yok");
		} else {
System.out.println("girdi�iniz harf c�mledevar");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
