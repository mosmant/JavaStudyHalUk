package TECHNOSTUDY_ISMETBY.Gun52Interfaces.Ornek5;

public class Cember implements ISekil {

    @Override
    public int cevresi(int... dizi) {
        return (int) (2 * PI * dizi[0] * dizi[0]);
    }

    @Override
    public int alani(int... dizi) {
        return (int) (PI * dizi[0] * dizi[0]);
    }
}
