package _JavaStudy._08_Arrays;

import java.util.Arrays;

public class Soru_10 {

    public static void main(String[] args) {



        /*

iki ayrı int array oluşturun. İkisinin de eleman sayısı  5 olsun.

Elemanlar .random atansın. (15 e kadar - 15 dahil)


2 int array'i de ekrana yazdırınız.  (1.dizi =
                                                        2.dizi=        )



Eğer iki arrayda ortak elemanlar varsa o elemanları yazdırınız.
Yoksa, "ortak eleman yoktur" mesajını konsola yazdırınız.

ÖRNEK:
1.Dizi : [1,2,3,4,5]
2.Dizi : [4,5,6,7,8]

ortak eleman: 4     ortak eleman: 5

    // TODO: 1  İpucu :

           Ortak eleman ararken oluşturacağınız koşula int count ekleyin.
Eğer ortak eleman varsa count++
Eğer ortak eleman yoksa, count==0 ise           "ortak eleman yoktur".

         */

        int[] dizi = new int[5];
        int[] dizi2 = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 15 + 1);
        }

        System.out.println("1. Dizi :  " + Arrays.toString(dizi));


        for (int i = 0; i < dizi.length; i++) {
            dizi2[i] = (int) (Math.random() * 15 + 1);
        }

        System.out.println("\n  2. Dizi  :" + Arrays.toString(dizi2));

        int count = 0;
        for (int i = 0; i < dizi.length; i++) {

            for (int j = 0; j < dizi.length; j++) {

                if (dizi[i] == dizi2[j]) {
                    System.out.print("ortak eleman:" + dizi[i] + "   ");
                    count++;
                }
            }

        }
        if (count == 0) {
            System.out.println("ortak elemen yoktur");
        }

    }

}







