package Abstraction;

import java.security.PublicKey;

public class Person {

    String name ="";
    int age = 0;

    public Person (String s, int a) {
        name = s;
        age = a;
    }

    public void show_person_details () {
        System.out.println("The name of the person is " + name);
        System.out.println("The age of the person is " + age);



    }




}
