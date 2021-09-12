package JavaCybertekSchool_2020.day48_Inheritance.Phone;

public class Samsung extends Phone {
    static{
        brand = "Samsung";
        operatingSystem ="Android";
        madeIn = "South Korea";
    }
    public Samsung (String model, double price, int size) {
        super.setInfo(model, price, size);
    }


    public void freezing(){
        System.out.println(brand+" "+model+ " is freezing...........");
    }

}
