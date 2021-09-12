package _JavaStudy._01_DataType_ScannerClass;

public class Soru_08 {

    // Write a Java program to break an integer into a sequence of individual digits.
// Hint: use / and %
// ex: input: 12345
//    output: 1
//            2
//            3
//            4
//            5

    public static void main(String[] args) {

        int x = 12345;
        int birler = x % 10;
        int onlar = (x / 10) % 10;
        int yuzler = (x / 100) % 10;
        int binler = (x / 1000) % 10;
        int onbinler = (x / 10000);
        System.out.println(onbinler + "\n" + binler + "\n" + yuzler + "\n" + onlar + "\n" + birler);

        // Different Solution:
        int input1 = 12345;
        String sayi = input1 + "";
        String[] t = sayi.split("");
        for (String n : t) {
            System.out.println(Integer.parseInt(n));
        }
    }
}
