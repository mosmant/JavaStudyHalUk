package JavaCybertekSchool_2020.day45_Constructor;

/*
1. create a class called Item
                instance variables:
                    name, unitPrice, quantity

                add a constructor that can initialize the fields

                instance methods:
                    calcCost(): returns the total cost as double
                                hint: quantity * unitPrice
                    toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */

public class Item {

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }


    public double calcCost(){
        return unitPrice * quantity;
    }


    public String toString(){
        return "Name: "+name+", Unit Price: "+unitPrice+", Quantity: "+quantity+", Total Price: $"+calcCost();
    }




}
