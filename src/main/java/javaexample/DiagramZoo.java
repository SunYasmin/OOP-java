package javaexample;

public class DiagramZoo {

    /**
    Bir hayvanat bahçesindeki hayvanlar hakkındaki bilgileri takip etmek için bir sistem tasarlıyorsunuz.

    Hayvanlar:
    Atlar (atlar, zebralar, eşekler vb.),
    Kedigiller (kaplanlar, aslanlar vb.),
    Kemirgenler (sıçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.
    Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır.
    tür adı, ağırlığı, yaşı vb.
    Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()
    Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()
    Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.

    Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlayın.
    */


    /*Aşağıda verilen sınıf diyagramı, Hayvanlar adlı bir ana sınıfı (Animal) içerir
    ve bu sınıftan türetilen alt sınıflar aracılığıyla çeşitli hayvan grupları temsil edilir.
    Her hayvan grubu için farklı yem verme algoritmalarını ve ilaç dozajlarını hesaplayabilen
    metotlar (getDosage ve getFeedSchedule) bulunur.
    Polimorfizm, bu alt sınıfların ortak ana sınıf (Animal) üzerinden kullanılmasına olanak tanır.
     */

    /**
     * Sınıf Diyagramı:
     *
     *
     *             +-------------------+
     *             |      Animal       |
     *             +-------------------+
     *             | - species: String |
     *             | - weight: double  |
     *             | - age: int        |
     *             +-------------------+
     *                    / \
     *                   /   \
     *                  /     \
     *                 /       \
     *                /         \
     *               /           \
     *              /             \
     *  +-----------------+   +----------------+
     *  |      Horse      |   |     Tiger      |
     *  +-----------------+   +----------------+
     *  | +getDosage():   | | +getDosage():   |
     *  |   double        | |   double        |
     *  | +getFeedSchedule()| | +getFeedSchedule()|
     *  |   String        | |   String        |
     *  +-----------------+   +----------------+
     *
     */


    /*
    Aşağıda, verilen senaryoya uygun bir sınıf diyagramı ve bu diyagrama dayalı olarak yazılmış bir Java kod örneği bulunmaktadır.
    Bu tasarım polimorfizmi kullanır ve farklı hayvan grupları için özelleştirilmiş davranışları yönetir.
     */



    abstract class Animal {
        private String species;
        private double weight;
        private int age;

        public Animal(String species, double weight, int age) {
            this.species = species;
            this.weight = weight;
            this.age = age;
        }

        public abstract double getDosage(); // İlaç dozajını hesapla
        public abstract String getFeedSchedule(); // Yem verme zamanlarını hesapla

        // Diğer ortak özellikler ve davranışlar
    }

    class Horse extends Animal {
        public Horse(String species, double weight, int age) {
            super(species, weight, age);
        }

        @Override
        public double getDosage() {
            // Atlar için ilaç dozajı hesaplama mantığı
            return 0.1 * getWeight();
        }

        @Override
        public String getFeedSchedule() {
            // Atlar için yem verme zamanları hesaplama mantığı
            return "Sabah ve akşam yem ver.";
        }
    }

    private double getWeight() {
        return 0;
    }

    class Tiger extends Animal {
        public Tiger(String species, double weight, int age) {
            super(species, weight, age);
        }

        @Override
        public double getDosage() {
            // Kaplanlar için ilaç dozajı hesaplama mantığı
            return 0.2 * getWeight();
        }

        @Override
        public String getFeedSchedule() {
            // Kaplanlar için yem verme zamanları hesaplama mantığı
            return "Her gün aynı saatte yem ver.";
        }
    }

    class Rat extends Animal {
        public Rat(String species, double weight, int age) {
            super(species, weight, age);
        }

        @Override
        public double getDosage() {
            // Kemirgenler için ilaç dozajı hesaplama mantığı
            return 0.05 * getWeight();
        }

        @Override
        public String getFeedSchedule() {
            // Kemirgenler için yem verme zamanları hesaplama mantığı
            return "Günde bir defa yem ver.";
        }
    }

// Diğer hayvan grupları için de aynı şekilde sınıflar oluşturulabilir.




}
