package TechProEd2021._01_JavaTechProEd.day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
	/*	Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
		  - Method�da indirim uygulayip fiyati main method�da yazdirin
		  - Method�lari arka arkaya cagirip dogru calistiklarini kontrol edin
*/
		
		double fiyat=100;
		System.out.println("%10 indirimli fiyat : " + indirimUygula10(fiyat)); //%10 idirimli fiyat : 90.0
		System.out.println("%20 indirimli fiyat : " + indirimUygula20(fiyat)); //%20 idirimli fiyat : 80.0
		System.out.println("%20 indirimli fiyat : " + indirimUygula25(fiyat)); //%25 idirimli fiyat : 75.0
		System.out.println("method call'dan sonra fiyat : " + fiyat); //method call'dan sonra fiyat : 100.0
		
		//double fiyat;
	}

	public static double indirimUygula25(double fiyat) {
			
		fiyat*=0.75;
		//double fiyat;
		return fiyat;
	}

	public static double indirimUygula20(double fiyat) {
				
		fiyat*=0.80; 
		//double fiyat;
		return fiyat;
	}

	public static double indirimUygula10(double fiyat) {
		
		
		fiyat*=0.90;
		//double fiyat;
		return fiyat;
	}

}
