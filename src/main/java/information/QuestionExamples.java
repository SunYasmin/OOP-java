package information;

public class QuestionExamples {

    /**Main method overloading
     * What will be the output of the following code?
    class OverloadMain

        public static main(int a)   //ancak aşırı yüklenmiş ana yöntemde void belirticisi yoktur ve kod eksiktir.
        {
            System.out.println(a);
        }
        public static void main(String args[])
        {
            System.out.println("Method invoked");
            main(6);
        }
    }

     */

    /*
    Here, there are two main() functions and so main() method that takes an integer as an argument attempts to overload the original main method.
    The class may define any number of main() methods, but each method's signature must be unique.
    However, the void specifier is absent from the overloaded main method, and the code is incomplete.

        The full code is provided below:

        Burada, iki main() işlevi vardır ve dolayısıyla bir argüman olarak bir tamsayı alan main() yöntemi,
        orijinal ana yöntemi aşırı yüklemeye çalışır. Sınıf herhangi bir sayıda main() yöntemini tanımlayabilir,
        ancak her yöntemin imzasının benzersiz olması gerekir. Ancak aşırı yüklenmiş ana yöntemde void belirticisi yoktur ve kod eksiktir.

        Kodun tamamı aşağıda verilmiştir:
     */

        public static void main(int a)  //overloaded main method
        {
            System.out.println(a);
        }
        public static void main(String args[])    //main method
        {
            System.out.println("Method invoked");
            main(6);
        }
    }

