package Day17_devam;

import java.util.Scanner;

public class forsorudevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	oru 10 ) Kullanicidan iki sayi isteyin.
//Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
//sonucu yazdiran bir program yaziniz
	
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen iki say� griniz");
	int say�1=scan.nextInt();
	int say�2=scan.nextInt();
	
	int k���k=0;
	int buyuk=0;
	
	if (say�1>say�2) {
		buyuk=say�1;
		k���k=say�2;
	} else {
buyuk=say�2;
k���k=say�1;
	}
	
	 int topmlam�=0;
	 for (int i = k���k; i <=buyuk; i++) {
		
		topmlam�+=i; 
	}
	System.out.println(topmlam�);
	
	
	
	}

}
