import java.util.Scanner;

public class Haluk�dev3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		System.out.println("l�tfn be� basamkal� bir say� giriniz:");
		Scanner scan=new Scanner(System.in);
		
		
		int say�=scan.nextInt();
		
		int say�1 =say�%10;
		int say�2=(say�/10)%10;
		
		int say�3=(say�/1000)%10;
		int say�4=(say�/10000);
		
		int son=say�1+say�2+say�3+say�4;
		System.out.println("istenilen toplam:"+son);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
