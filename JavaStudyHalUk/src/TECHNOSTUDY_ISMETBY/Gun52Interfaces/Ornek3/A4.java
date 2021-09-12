package TECHNOSTUDY_ISMETBY.Gun52Interfaces.Ornek3;


//birden fazla interface den implemente edilebilir.
public class A4 implements IYazdirilabilir, IGösterilebilir {
    @Override
    public void goster() {
        System.out.println("gösterildi..");

    }

    @Override
    public void yazdır() {
        System.out.println("yazdırıldı...");

    }
}
