package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends5;

public class GeometriMain {
    public static void main(String[] args) {

        Dikdortgen dd = new Dikdortgen(4, 5);
        System.out.println("Dikdortgen = " + dd);// otomatik toString çalışır.

        Cember cember = new Cember(3);
        System.out.println("cember = " + cember);

        Kare kare = new Kare(6);
        System.out.println("kare = " + kare);

        System.out.println("cember.getAlan = " + cember.getAlan());
    }
}
