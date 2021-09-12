package JavaCybertekSchool_2020.day48_Inheritance.EmployeeTask;

public class Tester extends Employee {
    public Tester(double salary, String name, long id, String jobTitle, char gender) {
         setEmployee(salary, name, id, jobTitle, gender);
    }

    public void fundingBugs(){
        System.out.println(name +" is looking for bugs");
    }


    public String toString() {
        return "Name: "+ name+ " Job Title: "+jobTitle+" ID: "+id+" salary: "+salary+" gender: "+gender;
    }
}
