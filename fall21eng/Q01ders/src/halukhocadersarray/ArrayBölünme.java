package halukhocadersarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayB�l�nme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Kullanicidan aldigimiz 8 elemanli arrayin icinde
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
	
	Scanner scan=new Scanner(System.in);
	
int saya�=0;
int dizi[]=new int[8];
for (int i = 0; i < dizi.length; i++) {
	System.out.println("l�tfen  dizi say�s� griniz");
	int say�lar=scan.nextInt();
	
	dizi[i]=say�lar;
	
	if (dizi[i]%3==0) {
		saya�++;
	}
	
}
	
System.out.println(Arrays.toString(dizi));	
System.out.println(saya�);	
	
	
	
	
	
	
	
	
	
	}

}
