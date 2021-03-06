package Replit._09_oopInJAVA;

import java.util.ArrayList;
import java.util.Scanner;

interface deliveryOptions {

    int getTheTotal(ArrayList<String> list);

    String isFreeShipping(ArrayList<String> list);

    int AmazonMinFreeDelivery = 10000;
    int CostcoMinFreeDelivery = 15000;


}

class Amazon implements deliveryOptions {


    @Override
    public int getTheTotal(ArrayList<String> list) {

        int returnSayi = 0;

        for (String s : list) {
            if (s.charAt(s.length() - 1) == 'K') {
                s = s.replaceAll("[^0-9]", "");
                returnSayi += Integer.parseInt(s) * 1000;
            } else {
                s = s.replaceAll("[^0-9]", "");
                returnSayi += Integer.parseInt(s);
            }

        }

        return returnSayi;
    }

    @Override
    public String isFreeShipping(ArrayList<String> list) {

        String strReturn = "";

        if (getTheTotal(list) > AmazonMinFreeDelivery) {
            strReturn = "you are eligible for free delivery";
        }

        if (getTheTotal(list) < AmazonMinFreeDelivery) {
            strReturn = "you need to buy " + (AmazonMinFreeDelivery - getTheTotal(list)) + " amount of item.";
        }


        return strReturn;
    }


}

class Costco implements deliveryOptions {


    @Override
    public int getTheTotal(ArrayList<String> list) {
        int returnSayi = 0;

        for (String s : list) {
            if (s.charAt(s.length() - 1) == 'K') {
                s = s.replaceAll("[^0-9]", "");
                returnSayi += Integer.parseInt(s) * 1000;
            } else {
                s = s.replaceAll("[^0-9]", "");
                returnSayi += Integer.parseInt(s);
            }

        }

        return returnSayi;
    }

    @Override
    public String isFreeShipping(ArrayList<String> list) {
        String strReturn = "";

        if (getTheTotal(list) > CostcoMinFreeDelivery) {
            strReturn = "you are eligible for free delivery";
        }

        if (getTheTotal(list) < CostcoMinFreeDelivery) {
            strReturn = "you need to buy " + (CostcoMinFreeDelivery - getTheTotal(list)) + " amount of item.";
        }


        return strReturn;
    }
}

public class _11_Interface2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        ArrayList<String> listNumbers = new ArrayList<>();

        int counter = 0;
        while (scan.hasNext()) {

            listNumbers.add(scan.nextLine());
            counter++;
            if (counter == 11) {

                break;
            }

        }

        // while calling the methods in the classes use listNumbers arraylist

        Amazon amazon = new Amazon();
        Costco costco = new Costco();

        System.out.println(amazon.isFreeShipping(listNumbers));
        System.out.println(costco.isFreeShipping(listNumbers));


    }

}

/*
    deliveryOptions  class interface'i (aray??z) yap.

    3 tane method olu??turun.
    birinci methodun ismi getTheTotal parametresi String arraylist, return type'?? int.
    ikinci methodun ismi isFreeShipping  parametresi String arraylist, return type'?? String.

    iki tane int olu??turun.
    ilki AmazonMinFreeDelivery = 10000
    ikincisi CostcoMinFreeDelivery =  15000

    Amazon class'??n??n i??inde
    getTotal method'unun i??inde 3 tane bunun gibi Stirng vard??r.  $3K , $200 , $1K

    String'leri int yap??n??z ve toplam say??ya return ediniz.
     not: sonunda K olan say??lar 1000 ile ??arp??l??r.

    isFreeShipping  methodunun i??inde
     E??er toplam say?? AmazonMinFreeDelivery'den y??ksekse "you are eligible for free delivery" yad??r??n??z.

    E??er toplam say?? AmazonMinFreeDelivery'den d??????k ise "you need to buy ..... amount of item." yazdr??n??z.


    Costco  class'??n??n i??inde
    getTotal'?? ve deliveryOptions interface'indeki isFreeShipping methodunu override edin.

    getTotal methodunun i??inde bunun gibi Stringler vard??r. $3K , $200 , $1K

    Stirng'leri int yap??n ve toplam say??ya return edin.
    not: sonunda K olan say??lar 1000 ile ??arp??l??r.

    isFreeShipping  methodunun i??inde;
    E??er toplam say?? CostcoMinFreeDelivery'dan y??ksekse "Print you are eligible for free delivery" yazd??r??n??z.
    E??er toplam say?? CostcoMinFreeDelivery 'dan d??????kse "print you need to buy ..... amount of item." yazd??r??n??z.

    main method'un i??inde
    iki tane objects olu??turun.
    Biri Amazon class'?? i??in
    Di??eri costco class?? i??in.

    amazon class'??n??n i??inde isFreeShipping'i ??a????r??n ve sonucu yazd??r??n.
    costco class'??n??n i??inde isFreeShipping'i ??a????r??n ve sonucu yazd??r??n.
 */
