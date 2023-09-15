package inheritance;

public class Parent {

    String name = "";

    public Parent(String s) {
        name = s;
    }

    public void show_name(){

        System.out.println("The name is " + name);
    }
}
