package TECHNOSTUDY_ISMETBY.Gun51Polymorphism.Ornek1;

public class Kopek extends Hayvan {
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("havladı");
    }

    public void kokladi() {
        System.out.println("kopek kokladı");
    }
}
