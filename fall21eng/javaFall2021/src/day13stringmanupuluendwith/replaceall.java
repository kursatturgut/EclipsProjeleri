package day13stringmanupuluendwith;

public class replaceall {

	public static void main(String[] args) {
		
		String str="*java 98ogrenmek c..ok k876olay";
		//replaceall metodlar� kullanarak java ��renmek cok kolay yapacag�m
		
		str=str.replaceAll("\\d", "");
		System.out.println(str);
		
		str=str.replaceAll("\\s", "x");
		
		
		
		
		
		String cumle = "java     �ok zevkli";
		cumle=cumle.replaceAll("\s+", " ");
		
		System.out.println(cumle);
		
		cumle=cumle.replaceAll("[a-k]", "");
		
		System.out.println(cumle);
		
		
		
		
		
		
		
		
		
		
		
	}

}
