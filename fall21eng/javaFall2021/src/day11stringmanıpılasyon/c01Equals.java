package day11stringman�p�lasyon;

public class c01Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b= a+0;
		System.out.println(a==b); // degere bak�yor ref olmad�g� i�in zaten bakmas� gerekmez 
		
		char c='k';
		char d= 'k'+0;
		System.out.println(c==d);  // say�sal degere bak�yor  ref olmad�g� i�in zaten bakmas� gerekmez 
		
		String str1="Ali";
		String str2="Can";
		String str3="Ali Can";
		String str4=str1+" "+str2;
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);        //degerler e�it ama referanslar esit de�il diye false verir �nemli
		System.out.println(str3.equals(str4));// referanslara bakmaz degerlere bakar true yazdr�r .steak ve heap haf�zayla alakal�.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
