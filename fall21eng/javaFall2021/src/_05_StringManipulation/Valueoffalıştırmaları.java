package _05_StringManipulation;

public class Valueoffal��t�rmalar� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String paraErkek="1900";
		String paraKad�n="2000";
		
		//ailenin toplam gelirirni bulunuz 
		
		Integer a=Integer.valueOf(paraErkek);
		Integer b=Integer.valueOf(paraKad�n);
		System.out.println("toplam gelir:"+(a+b));
		System.out.println(Integer.valueOf(paraErkek)+Integer.valueOf(paraKad�n));
		
		
		int maa�=1200;
		int maa�2=2200;
		
		String.valueOf(maa�);
		String.valueOf(maa�2);
		System.out.println(String.valueOf(maa�)+String.valueOf(maa�2));
		
		String kelime="65";
		
		int say�Hali=Integer.parseInt(kelime);
		System.out.println(say�Hali);
		
      String bg�1="500";
      String bg�2="1500";
      
      int say�=Integer.valueOf(bg�1);
    	int say�1=Integer.valueOf(bg�2);	  
		
	topla(say�,say�1);	
	
	// Soru :String olarak verilen karenin 1 kenar uzunlu�undan
    // karenin �evresinin uzunlu�unu bulunuz.
	String kenar="8";
	
	Integer kenar1=Integer.valueOf(kenar);
	int cevre=kenar1+kenar1+kenar1+kenar1;
	System.out.println(cevre);
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void topla(int say�, int say�1) {
		System.out.println(say�+say�1);
		
	}

}
