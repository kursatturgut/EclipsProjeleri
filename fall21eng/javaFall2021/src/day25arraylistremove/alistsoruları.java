package day25arraylistremove;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class alistsorular� {

	public static void main(String[] args) {
		// 100 den k���k fibonacii say�s�n�  bir list olarak yazd�r�n 
 // 1,1,2,3,5,8,13,21,34
   
		int s�n�r=100;
	List<Integer>fibonacc�=new ArrayList<>();
	fibonacc�.add(1);
	fibonacc�.add(1);
	int say�=0;
	
		while (say�<s�n�r) {
			
			say�=fibonacc�.get(fibonacc�.size()-2)+fibonacc�.get(fibonacc�.size()-1);
			fibonacc�.add(say�);
			
		}
	System.out.println(fibonacc�);
   fibonacc�.remove(fibonacc�.size()-1);
   System.out.println(fibonacc�);
	
Collections.sort(fibonacc�);
	
	System.out.println(fibonacc�);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
