package inheritance;

public class GrandChild extends Child{

    String gender = "";


    public GrandChild(String s, int a, String g) {
        super(s, a);
        gender = g;
    }

    public void show_gender() {

        System.out.println("The gender is " + gender);
    }

}
