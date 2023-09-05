package oopexample;

import java.util.Scanner;

public class Students {

    //Scanner scan = new Scanner(System.in);   Use Constructor

    String name = "";  //local variable
    int marks = 0;   //local variable

    /*
    public void get_details () {

        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Enter your marks");
        marks = scan.nextInt();
    }
     */
    //lets do with constructor:
    public Students(String n, int m) {
        name = n;
        marks = m;
    }


    public void show_details() {

        System.out.println("Name of the student is " + name);
        System.out.println("Marks of the student are " + marks);


    }

}
