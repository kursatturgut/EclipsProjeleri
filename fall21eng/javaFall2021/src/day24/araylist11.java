package day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class araylist11 {

	public static void main(String[] args) {
		// 
		// Verilen bir array'den istenen degere sahip elementleri silip
				// kalani yeni bir array olarak kaydedin
				// ve sonra yeni array'i yazdirin
				
				int arr[]= {3,4,5,6,3,5};
				int silinecekEleman=3;
	
	List<Integer> ge�ici=new ArrayList <>();
	
	for (int i = 0; i < arr.length; i++) {
		
		if (arr[i]!=silinecekEleman) {
			ge�ici.add(arr[i]);
		}
		
		
	}
	// System.out.println(ge�ici);
	
	
	int yeniArray[]=new int[ge�ici.size()];
	
	for (int i = 0; i <ge�ici.size() ; i++) {
		
	yeniArray[i]=ge�ici.get(i);
	
	}
	
	System.out.println(Arrays.toString(yeniArray));
	
	
	
	
	
	
	
	
	
	
	}

}
