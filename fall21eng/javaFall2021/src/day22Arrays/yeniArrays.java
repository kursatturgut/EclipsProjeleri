package day22Arrays;

import java.util.Arrays;

public class yeniArrays {

	public static void main(String[] args) {
		// 

	
	String [] �r�nler= {"derskitab�","kitap","kalem","silgi","defter"};
	
Arrays.sort(�r�nler);	
	System.out.println(Arrays.toString(�r�nler));
	
	�r�nler[0]="bigisayar";
	System.out.println(Arrays.toString(�r�nler));
	
	Arrays.binarySearch(�r�nler, "kitap");
	System.out.println(Arrays.binarySearch(�r�nler, "kitap"));
	
	Arrays.binarySearch(�r�nler,"hal�");
	System.out.println(Arrays.binarySearch(�r�nler,"hal�"));
	
	
	
	
	
	
	
	
	}

}
