
public class ders1 {

	public static void main(String[] args) {
	
		// 12345 say��n�n rakama de�erlerini yukardan a�ag� yaz�n�z 
		// konsolda alt sat�r i�in ters s�la� n kullan�l�r 
		System.out.println(12345);
		int say�=12345;
		int birler=say�%10;
		int onlar=(say�/10)%10; 
		int y�zler=(say�/100)%10;
		int binler=(say�/1000)%10;
		int onbinler=(say�/10000)%10;
		System.out.println(birler);
		System.out.println(onlar);
		System.out.println(y�zler);
		System.out.println(binler);
		System.out.println(onbinler);
		System.out.println(onbinler+"\n"+binler+"\n"+y�zler+"\n"+onlar+"\n"+birler);  // ters�l� n bir alt sat�ra atar yaz�m �nemli
		
		
		
		

	}

}
