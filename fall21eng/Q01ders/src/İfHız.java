import java.util.Scanner;

public class �fH�z {

	public static void main(String[] args) {
		
		  /*
        Problem tanimi : 
      Kulan�c�dan arac�n�n h�z�n� al�n�z
      Trafik cezas�n�n de�erini hesaplay�n.
          45 h�z s�n�r�d�r.
          E�er h�z�n�z 55-74 aras�nda ise:
          Ceza 100 $'d�r.

          E�er h�z�n�z 75 - 84 aras�nda ise:
          Ceza 150 $'d�r.

          E�er h�z�n�z 85 -94 aras�nda ise:
          Ceza 320 $'d�r.

          E�er h�z�n�z 94'den daha fazla ise:
          Ceza 500 $'d�r.

          ve ayr�ca,
          E�er s�r�c�n�n ehliyeti yoksa cezaya 200 $ eklenir.

          �rn: H�z�n�z 77 iken cezan�z 150$'d�r ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

          �rn;

          currentSpeed(H�z�n�z) 87
          ve isDriverLicenceAvailable(Ehliyeti var m�?) = true;

          sonu� 320 olmal�d�r.

          currentSpeed(H�z�n�z) 65
          ve isDriverLicenceAvailable(Ehliyeti var m�?) = false;

          sonu� 300 olmal�d�r.
   */
Scanner scan=new Scanner(System.in);
System.out.println("dou you have a driver licance please yes or no\n");
char l�cance=scan.next().toUpperCase().charAt(0);
System.out.println("please you write your currentspeed");
 int speed=scan.nextInt();
 
 
	

 
		if (l�cance=='Y') {
			if (speed>94) {
				System.out.println("500$");
			}
			else if (speed>84) {
				System.out.println("320$");	
			}
			else if (speed>74) {
				System.out.println("150$");	
			}
			else if (speed>54) {
				System.out.println("100$");	
			}else {
				System.out.println("yolunuz ac�k olsun ");
			}
			
			
			
			
			
		} else {
			if (speed>94 && l�cance=='N') {
				System.out.println("700$");
			}
			else	if (speed>84 && l�cance=='N') {
				System.out.println("520$");	
			}
			else if (speed>74&& l�cance=='N') {
				System.out.println("350$");	
			}
			else if (speed>54 && l�cance=='N') {
				System.out.println("300$");	
			}else {
				System.out.println("cezan�z 200$");
			}
			}
			
			
			
			
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


