package _JavaStudy._05_ForLoop.Cozumler;

public class Soru_13 {


    public static void main(String[] args) {


//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21
//        22 23 24 25 26 27 28
//        29 30 31 32 33 34 35 36

        int number=1;

        for (int satir = 1; satir <= 8; satir++) {//satır kontrolü

            for (int sutun = 1; sutun <= satir; sutun++) {//sutun kontrolu
                System.out.print(number++ + " ");
            }
            System.out.println();


        }





    }
}
