package Replit.replitManipulations;

import java.util.Scanner;

public class ParseHTML {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	    if(html.indexOf("<html>")>-1){
	      String [] a1=html.split("id=\"");
	      String s1=a1[1];
	      String [] a2=s1.split("\"");
	      String s2=a2[0];
	      System.out.println(s2);
	    }else{
	      System.out.println("Invalid input!");
	    }
//	    <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>

	    scan.close();
	}

}
