package TECHNOSTUDY_ISMETBY.KarmaSorular;

class C {
    public C() {
        System.out.println("C ");
    }
}

class B extends C {
    public B() {
        //super();  yandaki metod yazılsa da yazılmasa da Önce super Constructor cagriliyor
        System.out.println("B ");
    }
}

class A extends B {
    public A() {
        //super();  yandaki metod yazılsa da yazılmasa da Önce super Constructor cagriliyor
        System.out.println("A ");
    }
}

public class Soru5 {
    public static void main(String[] args) {
        A a = new A();
    }
}
