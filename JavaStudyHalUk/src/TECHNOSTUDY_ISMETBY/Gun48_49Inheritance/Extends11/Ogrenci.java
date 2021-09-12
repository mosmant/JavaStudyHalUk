package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends11;

public class Ogrenci extends Kisi {

    private String sube;

    public Ogrenci(String ad, String soyad, String gorevi, String sube) {
        super(ad, soyad, gorevi);
        this.sube = sube;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    @Override
    public void bilgileriYaz() {
        super.bilgileriYaz();
        System.out.println("Şube: " + getSube());
    }
}
