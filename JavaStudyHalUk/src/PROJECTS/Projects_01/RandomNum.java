package PROJECTS.Projects_01;

import java.util.Scanner;

public class RandomNum {


    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */



 /*

    Veri tipi integer olan max sayısı verildiğinde

    0 ile max sayisi arasindan random bir sayi elde et(olustur)

    output tipi int olmalı


  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.parseInt(scanner.nextLine());

        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin
        double random=Math.random();
        int max1= max;
        double r1=random*max1;
        int i1=(int)r1;
        System.out.println(i1);
    }
}