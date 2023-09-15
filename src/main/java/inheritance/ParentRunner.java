package inheritance;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ParentRunner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name: ");
        String my_name = scan.next();

        System.out.println("Enter age: ");
        int my_age = scan.nextInt();

        System.out.println("Enter gender: ");
        String my_gender = scan.next();

        // ilk hali :     GrandChild obj = new GrandChild("Anne", 25, "Female");
        GrandChild obj = new GrandChild(my_name, my_age, my_gender);


        obj.show_age();
        obj.show_gender();
        obj.show_name();



    }
}