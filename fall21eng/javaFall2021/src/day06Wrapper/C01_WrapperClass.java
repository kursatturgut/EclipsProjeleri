package day06Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		int say�1=10;  // primitive 
		Integer say�2=20;// nonprimitive
		
		// stringin i�inde matematikel ifadeler varsa wrapper class sayesinde matematikse� kar��l���n� veriri 
		//say� 1 yazd���m�zda metod ��kmaz
        // say� 2 dedi�imizde method ��kar 
		
		String tel1="1";
		String tel2="2";
		
	System.out.println(tel1+tel2);	
	//bu say�lar� toplamak istedim i�lem yapmak istedim diyelim
	System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		
		System.out.println(Integer.MIN_VALUE); //degerleri g�rebiliyoruz 
		System.out.println(Integer.MAX_VALUE);
		
		// Integer.valueOf metodu string numaralar� say�ya �eviri ancak ancak ifadede numerik olmayn karakter olursa java hata verir 
		//
		
		String caddeNo="234";
		String sokakNo="768";
		System.out.println(Integer.valueOf(sokakNo)+Integer.valueOf(caddeNo));
		
		
		
		
		
		
		
		
		
		
		
	}

}
