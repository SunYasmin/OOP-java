package Abstraction;

import java.util.Scanner;

public class PersonRunner {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name");
        String my_name = scan.next();

        System.out.println("Enter age");
        int my_age = scan.nextInt();

        System.out.println("Enter salary");
        int my_salary = scan.nextInt();


        Man m = new Man(my_name, my_age, my_salary);

        m.task();
        m.show_person_details();

    }


}
