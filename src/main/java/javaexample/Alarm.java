package javaexample;

import java.util.Timer;
import java.util.TimerTask;

public class Alarm {

    /**Java ile basit bir alarm sistemi uygulaması yazabiliriz.
     *Bu uygulama, 10 dakikada bir kırmızı alarm ve 15 dakikada bir yeşil alarm üretecek.
    Aşağıda bu işlevi yerine getiren bir örnek kod bulunmaktadır:
     */


    public static void main(String[] args) {
        Timer timer = new Timer();

        // 10 dakikada bir kırmızı alarm
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Kırmızı Alarm!");
            }
        }, 0, 10 * 60 * 1000); // 10 dakika (10 * 60 * 1000 milisaniye)

        // 15 dakikada bir yeşil alarm
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Yeşil Alarm!");
            }
        }, 0, 15 * 60 * 1000); // 15 dakika (15 * 60 * 1000 milisaniye)
    }


    /**
     * Bu kodda, Timer ve TimerTask sınıflarını kullanarak iki farklı alarm oluşturuyoruz.
     * Birinci alarm 10 dakikada bir, ikinci alarm ise 15 dakikada bir çalışır.
     * Alarm metni olarak "Kırmızı Alarm!" ve "Yeşil Alarm!" yazıları kullanıldı.
     * Bu örnek, temel bir alarm sistemi için basit bir başlangıçtır.
     * Gerçek bir alarm sistemi daha fazla özellik ve güvenlik gerektirir.
     */


    /*2. timer kullanmadan;
    public static void main(String[] args) {
        while (true) {
            try {
                // Her 10 dakikada bir kırmızı alarm
                Thread.sleep(10 * 60 * 1000); // 10 dakika (10 * 60 * 1000 milisaniye)
                System.out.println("Kırmızı Alarm!");

                // Her 15 dakikada bir yeşil alarm
                Thread.sleep(15 * 60 * 1000); // 15 dakika (15 * 60 * 1000 milisaniye)
                System.out.println("Yeşil Alarm!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
     */

}
