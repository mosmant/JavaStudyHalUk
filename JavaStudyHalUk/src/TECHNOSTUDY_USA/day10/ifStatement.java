package TECHNOSTUDY_USA.day10;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        /*
        /*
            if statement

            && -->> and operator

            || -->> or operator

            else if statement

         /

//       if(10<5){
//           System.out.println("10 is less then 5");
         */
        /*
        Create two strings

        if the first one is contains second one then
        print first is containing second one
        */
        Scanner dp = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String name1 = dp.nextLine();
        System.out.println("Enter the second name:");
        String name2 = dp.nextLine();
        if(name1.contains(name2)){
            System.out.println("First String is containing second String ");
        }
        if(name2.contains(name1)){
            System.out.println("Second String is containing first String ");
        }

    }
}
