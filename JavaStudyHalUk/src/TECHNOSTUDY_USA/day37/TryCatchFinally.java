package TECHNOSTUDY_USA.day37;

public class TryCatchFinally {

    public static void main(String[] args) {

        //try can be without catch, if there is finally, but it(try) cant be alone
        try {
            System.out.println("try block");
        } finally {
            System.out.println("finally block");
        }
    }
}