package _05_StringManipulation;

public class Mnupulasyon�dev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String text="Good";
	System.out.println(text.indexOf('o'));
	System.out.println(text.indexOf('k'));	
	int indeks=text.indexOf("G");	
	System.out.println(indeks);	
	int indekso=text.indexOf('o');
	
	String �i�ek= "g�nebakan;";
	int index1=�i�ek.indexOf('e');
	System.out.println(index1);
			
	System.out.println(�i�ek.lastIndexOf('a'));		
		
	String sehir="istanbul";
	
	char harf=sehir.charAt(6);	
		
	System.out.println(harf);	
		
	String kelime="merhaba dunya";
	
	System.out.println(kelime.charAt(3));		
	System.out.println(kelime.charAt(8));	
	
	String ss="her ders Java gibi olsa ";
	System.out.println(ss.substring(10));
	System.out.println(ss.substring(10,13));
	System.out.println(ss.substring(10,11));
	
	// ss'in ilk 10 karakteri * ile gizleyin, geriye kalanlar normal yazilsin
	
	System.out.println(ss.replaceAll("\\w", "*")+ss.substring(10));
	
	
	String city="     istanbul    ";
	System.out.println(city.trim());
	
	String �zellik="hayalperest";
	
	String �z=�zellik.replace('a', '@');
	
	System.out.println(�z);
	
String kuruYemi�="yer  f�st���";
System.out.println(kuruYemi�);
String de=kuruYemi�.replaceAll("yer", "kuruyemi�");
	System.out.println(de);
	
	
	String numara="$1800  Milyon";
	
	String num=numara.replaceAll("\\D", "");
	System.out.println(num);
	
	
	
	System.out.println(numara.contains("M"));
	
	String str="merhaba";
	String str1="Nerhanba";
	
	System.out.println(str==str1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
