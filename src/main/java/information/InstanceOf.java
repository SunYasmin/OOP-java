package information;

public class InstanceOf {

    /*
    Bu yazımızda da polymorphism ile bağlantılı ve bu kavramla birlikte kullanılan bir anahtar kelimeden bahsedeceğiz. Bu anahtar kelime instanceof’tur. Genellikle tanımlanan nesnelerin hangi sınıfa ait olduğunu öğrenmek için kullanılır.


    Bir önceki sorumuzu göz önünde bulundurarak anlatacak olursak; kedi, kopek ve kus adlı sınıflarımızı oluşturmuştuk. Burada 3 sınıf olduğu için hangi nesnenin, nerede olduğunu bulmak kolay olacaktır. Ancak 100 ve daha fazla sınıf olduğunu varsayarsak nesneleri karşılaştırmak ve hangi sınıfa ait olduğunu bulmak hem işimizi zorlaştıracak, hem de vaktimizi alacaktır. İşte bu sorunu engellemek için instanceof anahtar kelimesi kullanılmaktadır.



    Örneğimize devam edelim:





    Kopek k = new Kopek("Karabaş");

        if(k instanceof Hayvan){

        System.out.println("Bu Nesne Kopek Adlı Sınıfa Aittir. ");
    }


    Karabaş adlı nesneyi Kopek adlı sınıfa atadıktan sonra instanceof kelimesiyle o sınıfta olup olmamasını kontrol ettik ve bunu da basit bir if yapısıyla yazdırdık. Çıktımız:

    Advertisements

    REPORT THIS ADPRIVACY




    Bu kod satırını,  hayvan sınıfına ait olup olmamasını kontrol ederek de gerçekleştirebilirdik.



            Kopek k = new Kopek("Karabaş");

        if(k instanceof Hayvan){

        System.out.println("Bu Nesne Hayvan Adlı Sınıfa Aittir. ");
    }


    Çıktımız:





    Oluşturulan sınıf ve nesneler oluşturuldukları andan itibaren Object sınıfının da bir nesnesi olurlar. Yani bu örneğimizde; kedi, kopek ve kus adlı sınıflarımız hayvan adlı sınıfımızın bir alt sınıfı olduğu gibi, object sınıfımızın da bir alt sınıfıdır. Oluşturduğumuz hayvan adlı sınıf da object sınıfının bir alt sınıfıdır. Olayı görselleştirecek olursak:







    Hayvan sınıfı object sınıfından, kedi, köpek ve kuş sınıfları da hayvan adlı sınıftan türetilmiştir. Şimdi bunu baz alarak, yani nesneleri object sınıfından türeterek kodlarımızı oluşturalım.



    class Hayvan{

        private String isim;

        public Hayvan(String isim) {
            super();
            this.isim = isim;
        }


        public String getIsim() {
            return isim;
        }


        public void setIsim(String isim) {
            this.isim = isim;
        }


        public String Konus(){

            return "Hayvan Konuşuyor..";
        }

    }

    class Kedi extends Hayvan{

        public Kedi(String isim) {
            super(isim);

        }

        @Override
        public String Konus() {

            return this.getIsim() + " Miyavlıyor..";
        }


    }

    class Kopek extends Hayvan{

        public Kopek(String isim) {
            super(isim);

        }

        @Override
        public String Konus() {

            return this.getIsim() + " Havlıyor..";
        }


    }

    class Kus extends Hayvan{

        public Kus(String isim) {
            super(isim);

        }

        @Override
        public String Konus() {

            return this.getIsim() + " Ötüyor..";
        }



    }
    public class Text {


        public static void Konustur(Object object){



            if(object instanceof Kopek){

                System.out.println(((Kopek) object).Konus()); //Tür Dönüşümü


            }else if(object instanceof Kedi){

                System.out.println(((Kedi) object).Konus());


            }else if(object instanceof Kus){

                System.out.println(((Kus) object).Konus());


            }else if(object instanceof Hayvan){

                System.out.println(((Hayvan) object).Konus());


            }

        }

        public static void main(String[] args) {


            Konustur(new Kopek("Karabaş"));
            Konustur(new Kedi("Tekir"));
            Konustur(new Kus("Boncuk"));



        }

    }




    Yukarıdaki gibi tür dönüşümü ve instanceof anahtar kelimesi yardımıyla yine aynı çıktıyı alabilmek mümkün. Böylece sadece Konustur adlı sınıfa bakarak hangi nesnenin hangi sınıftan türetildiğini kolayca anlayabiliriz.

            NOT:  Yukarıda diğer kodlara ek olarak tür dönüşümünün uygulandığını görünüyoruz. Bu kodu object.Konus() olarak yazdığımızda Java otomatik olarak tür dönüşümünü uygulamaktadır.

    Eğer nesnelerin hangi sınıfta olduğunu console’da görmek istiyorsanız, kodları şu şekilde değiştirebilirsiniz:



    public class Text {


        public static void Konustur(Object object){


            if(object instanceof Kopek){

                System.out.println(((Kopek) object).Konus()); //Tür Dönüşümü
                System.out.println("Bu Nesne Kopek Adlı Sınıfa Aittir");


            }else if(object instanceof Kedi){

                System.out.println(((Kedi) object).Konus());
                System.out.println("Bu Nesne Kedi Adlı Sınıfa Aittir");


            }else if(object instanceof Kus){

                System.out.println(((Kus) object).Konus());
                System.out.println("Bu Nesne Kus Adlı Sınıfa Aittir");


            }else if(object instanceof Hayvan){

                System.out.println(((Hayvan) object).Konus());
                System.out.println("Bu Nesne Hayvan Adlı Sınıfa Aittir");


            }

            System.out.println("**********************************");

        }


        Çıktımız:





        Bu yazımızda da instanceof kavramını ve object sınıfı anlatmaya çalıştık. Umarım faydalı olmuştur. İyi çalışmalar 🙂

     */
}


