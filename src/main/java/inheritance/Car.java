package inheritance;

public class Car extends Vehicle{

/** Asagidaki sekilde yapmak hard coding oldu;
    String color = "Blue";
    int tyres = 4;

    public void show_car_details () {

        System.out.println("I'm a car");
        System.out.println("The color of the car is " + color);
        System.out.println("The number of tyres are " + tyres);

 }
 Simdi asagida parametreli constructor ile yapacagiz.
 */

    String color = "Blue";
    int tyres = 4;

public Car (int c, int m, String col, int ty ) {
    super(c,m);

    color = col;
    tyres = ty;
}


    public void show_car_details () {

        System.out.println("I'm a car");
        System.out.println("The color of the car is " + color);
        System.out.println("The number of tyres are " + tyres);

    }


}
