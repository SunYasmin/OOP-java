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


/**If a Demo class has a static block and a main() method with a print statement in both, which one will first execute, and why?
 *
 * Bir Demo sınıfında statik bir blok ve her ikisinde de print deyimi bulunan bir main() yöntemi varsa, ilk önce hangisi yürütülecek ve neden?
 */
class Demo
     {
     static
     {
     System.out.println("Static block");
     }
     public static void main(String args[])
     {
     System.out.println("Static method");
     }
     }

     /**The Jave Virtual Machine first executes the static block on a priority basis. It indicates that JVM looks for the static block before the main() method in the program. The main() method will then be called.

     Running the code above yields the following result:

     Static block
     Static method

     Note: Commonly asked Java OOPs interview question.

      Jave Sanal Makinesi öncelikle statik bloğu öncelik esasına göre yürütür. JVM'nin programdaki main() yönteminden önceki statik bloğu aradığını gösterir. Daha sonra main() yöntemi çağrılacaktır.

      Yukarıdaki kodu çalıştırmak aşağıdaki sonucu verir:

      Statik blok
      Statik yöntem

      Not: Yaygın olarak sorulan Java OOP mülakat sorusu.
      */