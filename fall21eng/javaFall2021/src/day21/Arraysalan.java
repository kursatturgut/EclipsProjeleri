package day21;

import java.util.Arrays;

public class Arraysalan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	int [] say�dizisi=new int[6];
	
	say�dizisi[0]=9;
	
	System.out.println(say�dizisi[0]);
	System.out.println(say�dizisi[say�dizisi.length-1]);

	int[] dizi= {2,3,50,6};
	System.out.println(dizi[0]);
	System.out.println(dizi[dizi.length-1]);
	System.out.println(dizi.length);
	
	for (int i = 0; i < dizi.length; i++) {
		System.out.print(dizi[i]+" ");
	}
	
	System.out.println(Arrays.toString(dizi));
	
	}

}
