package MENTORING._06_ClassMethods.a_ClassMethods;

public class Car {

    //todo              Static olmayan methodlar

    public void tamGaz() {

        System.out.println("Bu araba bütün arabalardan daha hızlı!!!!");
    }

    public void maxSpeed(int speed) {

        System.out.println("Bu arabanın maksimum hızı: " + speed);
    }

    public static void main(String[] args) {

        //Öncedlikle myCar diye bir referans oluşturuk.
        Car myCar = new Car();
        myCar.tamGaz();
        System.out.println("----------");
        myCar.maxSpeed(500);


    }
}
