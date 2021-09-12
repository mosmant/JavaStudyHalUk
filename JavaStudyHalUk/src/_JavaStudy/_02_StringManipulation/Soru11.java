package _JavaStudy._02_StringManipulation;

import java.util.Scanner;

public class Soru11 {
        // replace() methodu kullanmadan bir String'deki bosluklari kaldiran Java kodunu yaziniz
        //input : Te  cc h pro Educati   on'in Full Sta ck Kurslari baslamisti           r
        //output : TechproEducation'inFullStackKurslaribaslamistir.

        // main method
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Bosluklardan arindirmak istediginiz bir String giriniz");
            withOutSpaces(scan.nextLine());
            scan.close();
        }
        //Esit degilse ekle methodu
        public static String withOutSpaces(String word) { // String word = scan.nextLine();

            String wordWithOutSpaces = "";

            for(int i = 0; i<word.length(); i++) {
                if(word.charAt(i) != ' ') {
                    wordWithOutSpaces += word.charAt(i);
                }

            }
            System.out.println(wordWithOutSpaces);
            return wordWithOutSpaces;

        }
        //Esitse ekleme methodu
        public static String withOutSpaces2(String word) { // String word = scan.nextLine();

            String wordWithOutSpaces = "";

            for(int i = 0; i<word.length(); i++) {
                if(word.charAt(i) == ' ') {
                    continue;
                }else {
                    wordWithOutSpaces += word.charAt(i);
                }

            }
            System.out.println(wordWithOutSpaces);
            return wordWithOutSpaces;

        }
    }

