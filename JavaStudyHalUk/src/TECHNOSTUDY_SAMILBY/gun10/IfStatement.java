package TECHNOSTUDY_SAMILBY.gun10;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {



        /*
            if statement

            && -->> and operator (ve baglaci)

            || -->> or operator (veya baglaci)

            else if statement

            ! bir ifadenin degerini tersine cevirmek icin kullanilir (to negate the value)

         /

//       if(10<5){
//           System.out.HuseyinBYCalısma.println("10 is less then 5");
//       }


        /
        Create two strings

        if the first one is contains second one then
        print first String is containing second String
        */

        Scanner dp = new Scanner(System.in);

        System.out.println("Enter the first name");
        String name1 = dp.nextLine();

        System.out.println("Enter second name");
        String name2 = dp.nextLine();

        if (name1.contains(name2)) {

            System.out.println("first String is containing second String");

        }

        if (name2.contains(name1)) {

            System.out.println("Second String is containing the first String ");
        }

    }

}


