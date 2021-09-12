package TECHNOSTUDY_SAMILBY.gun37.uncheckedAndCheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaCheckedException {

    public static void main(String[] args){
        //File file = new File("TECHNOSTUDY_USA.example.txt");

        //checked(expected) exception must be used with try-catch
        //we can predict it before we execute/do that
        try {
            FileInputStream fis = new FileInputStream("TECHNOSTUDY_USA.example.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
