package Abstraction;

public class Iphone implements Phone{

    @Override
    public void cost() {
        System.out.println("Cost of Iphone is 100$");

    }

    @Override
    public void color() {
        System.out.println("Color of Iphone is Pink");

    }

    @Override
    public void batteryLife() {
        System.out.println("Battery Life of Iphone is 19 hours");

    }
}
