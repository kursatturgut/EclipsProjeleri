import java.util.Scanner;

public class �rbekWipper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("l�tfen bir say� giriniz:");
		
		String say�1=scan.nextLine();
		
		System.out.println("l�tfen bir say� daha giriniz:");
		
		String say�2=scan.nextLine();
		
		System.out.println(Integer.valueOf(say�1+say�2)); // burda asl�nda string gibi haretet etti.
		
		System.out.println(Integer.valueOf(say�1)+Integer.valueOf(say�2));
		
		System.out.println(Integer.valueOf(say�1)*Integer.valueOf(say�2));
		
		
		
	}

}
