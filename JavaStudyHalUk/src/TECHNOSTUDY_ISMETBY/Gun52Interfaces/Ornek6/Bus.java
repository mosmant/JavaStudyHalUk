package TECHNOSTUDY_ISMETBY.Gun52Interfaces.Ornek6;

public class Bus extends Vehicle implements IDiesel {


    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return "azami 80 km hızı geçmeyin...";
    }

    @Override
    public String changeDiesel() {
        return "Euro diesel kullanın...";
    }
}
