package day05_matematikseli�lemler;

public class C02_Matmatikseli�lemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int say�1=10;
		int say�2=20;
		
		String str1="ali";
		String str2="can";  //  can� hi� kullanmad�n hac� diyor 
		System.out.println(say�1+say�2+str1); //30ali
		System.out.println(str1+say�1+say�2);// ali1020  ilk ifade string diye string ald� 
		//ali30 yapmak i�in parantez laz�m 
		System.out.println(str1+(say�1+say�2));// ali 30
		
		System.out.println(str1+say�1*say�2);	//ali200	  �arpma �ncelik 
		
		
		
		
		
		

	}

}
