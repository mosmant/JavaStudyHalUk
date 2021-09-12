package JavaCybertekSchool_2020.day48_Inheritance.Phone;

public class IPhone extends Phone {

    static{
         brand = "Iphone";
         operatingSystem ="IOS";
         madeIn = "China";
    }


    public  IPhone(String model, double price, int size) {
        super.setInfo(model, price, size);
    }

    public void FaceTime(){
        System.out.println("Calling trough the FaceTime");
    }

}
