package �fHalukD;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy/100*boy/100)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
Scanner scan=new Scanner(System.in);
System.out.println("l�tfen boyunuzu cm olarak griniz");
double boy=scan.nextDouble();

System.out.println("l�tfen kilonuzu kg olarak griniz");
double kilo=scan.nextDouble();		
		
	double bm�=kilo/((boy/100)*(boy/100));
	
	
	if (bm�<=20) {
		System.out.println("zay�fs�n baya");
	}else if (bm�<=25) {
		System.out.println("normal kilo");
	}else if (bm�<=30) {
		System.out.println("s�sman");
	}else if (bm�>30) {
		System.out.println("obez");
	} 
		
		
		
		
		
		
		
		
		
    }

}
