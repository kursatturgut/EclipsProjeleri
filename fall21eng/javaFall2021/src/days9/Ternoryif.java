package days9;

public class Ternoryif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x =10;
	//	x%2==0 ? "�iftsay�"  : "teksay�;"   //kodu kabul etmedi variable olusturmam�z laz�m  de�i�ken olmal� ve data t�r� laz�m
			
	String tekMi�iftMi	=	x%2==0 ? "�iftsay�" : "teksay�";
		System.out.println(tekMi�iftMi);
		// d�nd�rd��� sey neyse ona g�re data t�r� olur
		
	System.out.println(x%2==0 ? "�iftsay�" : "teksay�");	
		
		// ternary iki �ekilde kullan�labilir ya d�nen sonuca g�re atama yapar�z 
	// ya da syo ile yazar ve yazd�r�r�z 
	// eger ternary de sonu�lar farkl� data t�r� ise atama yapamay�z sadece yazd�rabiliriz 
	//  sonu�=x>5 ? "aferin"	: 4;   //hangi data t�r�ne atama yapacak zor 
	System.out.println(x>5 ? "aferin"	: 4);	
		
		
		
		
		
		
		
		
	}

}
