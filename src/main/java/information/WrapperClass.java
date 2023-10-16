package information;

public class WrapperClass {

    //Using the code below, explain the wrapper class in Java.

        public static void main(String[] args) {

            // creating primitive types
            int a = 5;
            double b = 5.65;

            //converting into wrapper objects
            Integer aObj = Integer.valueOf(a);
            Double bObj = Double.valueOf(b);

            if(aObj instanceof Integer) {
                System.out.println("An object of Integer has been created.");
            }

            if(bObj instanceof Double) {
                System.out.println("An object of Double has been created.");
            }
        }


    /**
     * instanceof operatörü bir objenin belirli bir sınıfa ait olup olmadığını kontrol eder. Kalıtımı da hesaba kadar.
     * Böyle bir kontrole birçok durumda ihtiyacımız olabilir.
     */


}
