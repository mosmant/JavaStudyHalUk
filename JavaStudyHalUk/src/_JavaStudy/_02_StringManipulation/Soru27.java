package _JavaStudy._02_StringManipulation;

import java.util.Scanner;

public class Soru27 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 1. isim giriniz:"); String isim1=scan.nextLine().toLowerCase();
        System.out.println("Lutfen 2. isim giriniz:"); String isim2=scan.nextLine().toLowerCase();


        if (isim1.length()%2==0) {
            System.out.println(isim1.substring(0, (isim1.length()/2)).concat(isim2).concat(isim1.substring(isim1.length()/2 )));
        } else {
            System.out.println("isim1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }

        scan.close();


    }
}
