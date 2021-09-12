package JavaCybertekSchool_2020.warm_up_tasks.dinner;

public class Testers extends Employee{

    public void setInfo(String name, int age, char gender, String jobTitle, long ID, double salary){
        setEmployeeInfo(name, age, gender, jobTitle, ID, salary);
    }
     public void smokeTesting(){
         System.out.println(name+ " is running smoke tests");
     }
    public void creatingTicket(){
        System.out.println(name+ "is creating a ticket");
    }
    public String toString(){
        return "Name of Employee: "+name +", Job title: "+jobTitle+", age: "+age+", gender: "+gender+"\nID: "+ID+", salary: "+salary+"$";
    }
}
