package Day19doWwhileLoop;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen say� griniz rakamlar�n� toplayacag�m");
		int say�=scan.nextInt();
		
		int rakamlarToplam�=0;
		int rakam=0;
	//�NT � STR�NGE CEV�R�P BASAMAK SAYISINI BULMAK �NEML�
	
		String Say�str=""+say�;  // bas�na hi�lik eklersek string olur !!!!!!!!!!!!!!!!
		 for (int i = 0; i < Say�str.length(); i++) {
			     rakam=say�%10;
				rakamlarToplam�+=rakam;
				say�/=10;

		 
		 }
	System.out.println(rakamlarToplam�);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
