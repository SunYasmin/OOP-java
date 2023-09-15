package Abstraction;

public class Man extends Person implements Father{


    int salary = 0;
    public Man(String s, int a, int sa) {
        super(s,a);
        salary = sa;
    }
    @Override
    public void task() {
        System.out.println("Earn money");

    }
}
