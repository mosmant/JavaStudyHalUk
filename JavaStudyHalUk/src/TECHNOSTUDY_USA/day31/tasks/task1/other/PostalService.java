package TECHNOSTUDY_USA.day31.tasks.task1.other;


// cannot be accessed from different package
//import TECHNOSTUDY_USA.day31.tasks.q1.same.BankAccount;

import TECHNOSTUDY_USA.day31.tasks.task1.same.BankUser;

public class PostalService {

    public static void main(String[] args) {
        BankUser bankUser = new BankUser();
        // cannot be accessed from different package
        // BankAccount bankAccount = new BankAccount();
    }
}
