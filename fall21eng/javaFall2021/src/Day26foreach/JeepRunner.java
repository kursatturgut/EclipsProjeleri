package Day26foreach;

public class JeepRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Jeep ab = new Jeep();
		
		System.out.println(ab.fiyat+" "+ab.ilanNo+" "+ab.marka+" "+ab.model+" "+ab.y�l);
		
		ab.fiyat=130000;
		ab.ilanNo=123;
		ab.marka="toyota";
		ab.model="corolla";
		ab.y�l=2005;
		

		System.out.println(ab.fiyat+" "+ab.ilanNo+" "+ab.marka+" "+ab.model+" "+ab.y�l);
		
		ab.h�z(150);
		ab.yak�t("dizel");
		
		
		
		
	}

}
