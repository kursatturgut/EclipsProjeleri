package �fHalukD;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    	Scanner scan=new Scanner(System.in);
    	System.out.println("l�tfen bir say� griniz");
    	int say�=scan.nextInt();
    	
    	//  data turu variabla =    (sart)   ?ise  (  )   :de�ilse   ( ) ;
    	
    	String result = (say� >= 0)   ?  ( (say�<10) ? ("rakam"): ("pozitif say�") ) : ("negatif"); // sonuclara g�re sectik deta turunu string 
    	
    	System.out.println(result);
    	
    	if (say�>=0) {
                 			
    		
    		
		}
    	
    	
    	
    	
    	
    	
    	
    	
        
    }
}
