package TECHNOSTUDY_USA.day10;

import java.util.Scanner;

public class elseIfStart {
    public static void main(String[] args) {
         /*
            Else if  -->> When your if statement is false then JAVA will look for the first else if statement
                    when your first else if is also false then JAVA will look next else if statement.

                    When the condition is correct JAVA will not look other else statements

         */
        Scanner dp = new Scanner(System.in);
        System.out.println("Enter name1:");
        String name1 = dp.nextLine();
        System.out.println("Enter name2:");
        String name2 = dp.nextLine();

        int total = name1.length()+name2.length();

        // NOTE you can have else if statement as much as you want

        if(total>15){
            System.out.println("Strings are too long");
        }else if(total>10){
            System.out.println("your Strings are okay ");
        }else if(total>5){
            System.out.println("your Strings is too short ");

//              JAVA WILL PRINT ALL THE CONDITIONS BECAUSE OF ALL OF THEM ARE TRUE
//        if(total>15){
//
//            System.out.println("Your string is too long");
//
//        }
//
//        if(total > 10 ){
//
//            System.out.println("Your string is okay");
//
//        }
//
//        if(total >  5 ){
//
//            System.out.println("Your string is too short ");
//        }
        }

        }

    }

