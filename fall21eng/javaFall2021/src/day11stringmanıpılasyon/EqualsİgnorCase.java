package day11stringman�p�lasyon;

public class Equals�gnorCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4=str1+" "+str2;
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);        //
		System.out.println(str3.equals(str4));// 
		System.out.println(str3.equalsIgnoreCase(str4)); // case devre d�s� b�rak kullan�c�dan gelen verilerde cok kullanacag�z.bosluklara care bulamaz ! case
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
