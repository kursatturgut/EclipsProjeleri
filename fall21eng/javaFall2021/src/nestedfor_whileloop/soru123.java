package nestedfor_whileloop;

public class soru123 {

	public static void main(String[] args) {
		
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method olu�turun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
	  String name1 ="galatasara";
	  String name2= "fenerbah�e";
	
	yerle�tirme(name1,name2);
	
	
}

	private static void yerle�tirme(String name1, String name2) {
		
		if (name1.length()%2==0) {
			System.out.println(name1.substring(0, (name1.length()/2))+name2+name1.substring(name1.length()/2));
		} else {
System.out.println("koyamad�k");
		}
	
	
	
	
	
	}

}