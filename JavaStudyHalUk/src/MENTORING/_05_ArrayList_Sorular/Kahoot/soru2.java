package MENTORING._05_ArrayList_Sorular.Kahoot;

import java.util.ArrayList;

public class soru2 {
    public static void main(String[] args) {


        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();

        a.add("Ömer");
        a.add("Hüseyin");
        a.add("Ahmet");
        a.add("Mehmet");

        b.add("Nurdan");
        b.add("Osman");
        b.add("ömer");
        b.add("Ahmet");

        a.removeAll(b);


    }
}
