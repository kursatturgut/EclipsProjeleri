
public class �al��ma1 {

	public static void main(String[] args) {
		
		
		String Kredi1="h�zl� k�redi";
		String Kredi2="yava� kredi";
		String Kredi3="cok h�zl� kredi";
		String Kredi4="u�tra  k�redi";
		String Kredi5="pas kredi";
		String Kredi6="tas h�zl� kredi";
		
		System.out.println(Kredi1);
		System.out.println(Kredi2);
		System.out.println(Kredi3);
		System.out.println(Kredi4);
		System.out.println(Kredi5);
		System.out.println(Kredi6);
		
		String [] kirediler=
			{
					"h�zl� k�redi",
					"yava� kredi",	
					"cok h�zl� kredi",
					"u�tra  k�redi",
					"pas kredi",
					"tas h�zl� kredi",
					"hhhh kredisi",
					
			};
		//for each
		for(String kredi:kirediler) {
		System.out.println(kredi);	
			}

	for(int i =0; i< kirediler.length;i=i+1) {
		System.out.println(kirediler[i]);
		
		
		
		
	};
	
	
	
	
	
	
	
	}
}