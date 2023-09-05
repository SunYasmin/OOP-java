package oopexample;

import java.util.Scanner;

public class TestProject {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Students obj = new Students();  We use scanner obj.

        System.out.println("Enter your name");
        String my_name = scan.nextLine();

        System.out.println("Enter your bookmarks");
        int my_marks = scan.nextInt();

        //We use parameter constructor
        Students obj = new Students(my_name, my_marks);


        //obj.get_details();

        obj.show_details();


    }

}
