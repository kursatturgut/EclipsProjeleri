package day02;

public class C03_SwapVariable2 {

	public static void main(String[] args) {
		
		//verilen say� 1 ve say� 2 leri 3 bir variable olmadan swap program yap�mn�z 
		// say�1=10   say�2 =20
		
		int say�1=15;
		int say�2=20;
		
		System.out.println("�nce say�="+say�1+"veikinci say="+say�2);
		
		// ikinci bir veriable kullanmayacaksak say�lar�n fark�ndan isitifade ederiz 
		
		
		// 1 sa�lar�n fark�n� ilk say�ya at�yorum ass�ng 
		// 2 fark ile say� 2 yi toplay�p say�2 ye assin ediyorum 
		// 3 say�1 e say� 2 eksi fark assing ediyorum 
		
		say�1=say�1-say�2;
		say�2=say�1+say�2;
		say�1=say�2-say�1;
		
		System.out.println("�ncesay� ="+say�1+"veikinci say="+say�2);
				
		
	
		 //System.out.println("�nce say�="+say�1+"veikinci say="+say�2); neden say�1 den �nce ve sonra + koyuyoruz 
		
		
		//verilen iki de�erin yerini de�i�tirme 
		System.out.println("ba�lang��ta tak�m="+50+"ba�lang��ta zak�m="+80);
		
		int tak�m=50;
		int zak�m=80;
		    tak�m=tak�m-zak�m;  //-30
		    zak�m=tak�m+zak�m;// 50
		    tak�m=zak�m-tak�m;
		System.out.println("ba�lang��ta tak�m="+tak�m+"ba�lang��ta zak�m="+zak�m);    
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
