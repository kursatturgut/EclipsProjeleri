package day11stringman�p�lasyon;

public class �ndexsOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// paraametre grilen char ya da stringin ilk indexsini verir 
		String str="�al���rsan�z, java ��renmek �ok kolay";
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf("j"));
		System.out.println(str.indexOf('q'));
		// say�n�n olmad�g�n� bize -1 le d�nuyor 
		
		int index=str.indexOf("r"); // indexs herzaan int  data verisi d�ner 
		System.out.println(str.indexOf("�"));
		System.out.println(str.indexOf("java")); // ilk olan bak�yor ba�ld�g� indeksi verir 
		System.out.println(str.indexOf('a',11)); // 11 dahil sonrak� a y� arra 
		System.out.println(str.indexOf("va ��")); // charSquence  arasakta tek paket yapar ilk garfinin indeksini verir paketin ba�lang�� indeksini 
	
	
	
	}

}
