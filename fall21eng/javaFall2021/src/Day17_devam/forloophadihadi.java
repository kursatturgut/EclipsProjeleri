package Day17_devam;

import java.util.Scanner;

public class forloophadihadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru 9 ) Interview Question Kullanicidan bir String isteyin. 
		//Kullanicinin girdigi String�in palindrome olup olmadigini kontrol eden bir program yazin.

		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfn bir string griniz");
		String a=scan.next();
		
		

		String tersyaz�m ="";
		
		for (int i = a.length()-1; i >=0; i--) {
		
			tersyaz�m+=a.substring(i, i+1);
			
		
		}
		System.out.println(tersyaz�m);
		
		if (a.equalsIgnoreCase(tersyaz�m)) {
			System.out.println("palidrome");
		} else {
System.out.println("not pal�drome");
		}
		
		
		
		
		
		
	}

}
