package information;

public class Encapsulation {

    /**
     * Using the code below, explain Encapsulation in Java.
     *
     *  As you can see in the code above, we have multiple public functions that allow us to modify the different private variables in the class.
     *  This is referred to as "Encapsulation."

        In Java, "Encapsulation" combines data with the methods used to access and modify it into a single entity.

        Encapsulation allows for their isolation from other classes by designating a class's variables as private.

        However, we must also declare the setter and getter methods to change and view the values of these variables.
        Encapsulation is thus another name for data hiding.


     *Yukarıdaki kodda görebileceğiniz gibi, sınıftaki farklı özel değişkenleri değiştirmemize izin veren birden fazla ortak fonksiyonumuz var.
     * Buna "Kapsülleme" denir.

     *Java'da "Kapsülleme", verileri tek bir varlığa erişmek ve değiştirmek için kullanılan yöntemlerle birleştirir.

     *Kapsülleme, bir sınıfın değişkenlerini özel olarak atayarak diğer sınıflardan yalıtılmasına olanak tanır.

     *Ancak bu değişkenlerin değerlerini değiştirmek ve görüntülemek için setter ve getter yöntemlerini de bildirmemiz gerekir.
     *Kapsülleme bu nedenle veri gizlemenin başka bir adıdır.

        Note: Commonly asked Java OOPs interview question.
     */

        private String name;
        private String idNum;
        private int age;

        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }
        public String getIdNum() {
            return idNum;
        }
        public void setAge( int newAge) {
            age = newAge;
        }
        public void setName(String newName) {
            name = newName;
        }
        public void setIdNum( String newId) {
            idNum = newId;
        }

}
