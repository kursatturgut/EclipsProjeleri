package day01;

public class C03_Variables {

	public static void main(String[] args) {
		
		int say�1 =10;
		int say�2 =20;
		
		String say�3="10";
		String say�4 ="20";
		System.out.println(say�1+say�2); // rakam olarak tan�d� 
		
		System.out.println(say�3+say�4);   // yaz� gibi tan�d�
		
		
		// farkl� data turleri ayn� degeri tas�yabilir ama �nemli olan de�i�kenlerin hangi turde i�lem yapacag�m�zd�r 
		String harf1="A";
		char harf2 ='A';
		
		System.out.println(harf1);
		System.out.println(harf2);
		
		//de�i�kenleri kullanarak 30a yazd�r�n
		System.out.println(say�1+say�2+harf1); // 30a yazd� string yaz� metni alg�lad� 
		System.out.println(say�1+say�2+harf2); // 95 yazd� c�nk� a y� rakamsal degeini kabul etti char matematiksel i�lemlere girebilir 
		
		harf1="b";
		System.out.println(harf1);
		
		System.out.println(harf1+say�1+say�2); //   �nce strin varsa yanyan ayazar stringe cevirir i�lem �nceli�i var 

		System.out.println(harf1+(say�1+say�2));  //
	}

}
