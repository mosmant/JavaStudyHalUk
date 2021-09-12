package TECHNOSTUDY_ISMETBY.Gun48_49Inheritance.Extends13;

public class Yonetici extends Calisan {

    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, int id, int sorumluKisiSayisi) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayisi: " + this.sorumluKisiSayisi);
    }

    public void zamYap(int zamMiktari) {

        System.out.println(getAd() + " " + getSoyad() + " " + zamMiktari + " TL kadar zam yapıyor...");
    }
}
