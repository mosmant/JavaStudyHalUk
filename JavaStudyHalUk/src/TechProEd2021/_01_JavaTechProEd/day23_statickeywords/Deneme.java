package TechProEd2021._01_JavaTechProEd.day23_statickeywords;

public class Deneme {
	
	int x;
    static int y;
    
    Deneme (int i) {
        x+=i;
        y+=i;
    }
    public static void main(String[] args) {
        
        new Deneme(2) ; 
        Deneme dnm = new Deneme(3);
        System.out.println(dnm.x + "," +dnm.y);
    }

}
