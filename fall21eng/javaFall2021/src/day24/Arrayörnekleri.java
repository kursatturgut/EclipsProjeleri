package day24;

import java.util.Arrays;
import java.util.Scanner;

public class Array�rnekleri {
public static void main(String[]arg) {

	// kullan�c� girdigi sayi kadar int dizisi olu�tur ve dizi elemanlarini kullan�c�dan alan
		// ve girilen dizisi elemanlarinin en buyuk ile en k���k elemaninin arasinki farki gosteren
		// java program� yazin
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen dizi say�s�n� griniz");
	int dizisay�s�=scan.nextInt();
	
	int arr[]=new int[dizisay�s�];
	
	
	
	int fark=0;
for (int i = 0; i < dizisay�s�; i++) {
	System.out.println("l�tfen dizi rlelman�n� griniz");
	arr[i]=scan.nextInt();
	
	
	                           }
System.out.println(Arrays.toString(arr));

Arrays.sort(arr);
System.out.println(Arrays.toString(arr));

System.out.println(arr[(arr.length-1)]-arr[0]);



	                 }
}




































