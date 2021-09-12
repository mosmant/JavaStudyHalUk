package TechProEd2021._01_JavaTechProEd.day23_statickeywords;

public class StaticBlock {
	
	  static String isim;
	    // static block class calistirildiginda ilk olarak calisir (main method'dan bile once)
	    // static block'lar static variable'lara deger atamak icin kullanilir 
	    
	    static {
	        System.out.println("1.static block calisti");
	    }
	   
	    
	    public static void main(String[] args) {
	        
	        isim="Alican";
	        System.out.println(isim);
	        
	    }
	    static {
	        isim="Mehmet";
	        System.out.println(isim);
	    }

}
