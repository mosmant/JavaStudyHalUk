package _JavaStudy._05_ForLoop.Cozumler;

public class Soru_07 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {
        int harf=65;
        for (int satir = 0; satir <6 ; satir++) { //satır kontrolu

            for (int sutun = 0; sutun <= satir; sutun++) {
                System.out.print((char) (harf+sutun)+" ");
            }
            System.out.println();
        }
    }
}
