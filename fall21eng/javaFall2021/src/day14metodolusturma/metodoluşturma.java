package day14metodolusturma;

public class metodolu�turma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// verilen iki say�n�n toplam�n� ve carp�m�n� yap�p yazd�ran iki ayr� metod olu�turun

//  3 ad�mda metod	
	// 1  metod call ( main�in i�ine )
	// 2 metoda arguman yazacakm�y�z karar ver 
	// 3 1 ve ikiyi yapt�ktan sonra javadan yard�m al�p metodu olu�turuz 
	
	int a=20;
	int b=40;
	
	topla(a,b);
	
	carp(a,b);
	
	
	
	
	
	
	}

	private static void carp(int a, int b) {
		System.out.println(a*b);
	}

	public static void topla(int v, int j) {
		System.out.println(v+j);
		
	}

	
		
	

	

}
