
package odev_1;

import java.util.HashMap;
import java.util.Map;


public class PuanTablosu {
        Map<Oyun, Double> puanlar;

    public PuanTablosu() {
        this.puanlar = new HashMap<>();
    }
        // puan tablo goruntule bölümü
    public void puanTablosuGoruntule() {
        System.out.println("Puan Tablosu:");
        for (Map.Entry<Oyun, Double> entry : puanlar.entrySet()) {
            System.out.println(entry.getKey().getAd() + ": " + entry.getValue());
        }
    }
// oyunları puana göre sıralama
    public void enIyiOyunlar() {
        System.out.println("En İyi Oyunlar:");
        puanlar.entrySet().stream()
                .sorted((entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()))
                .limit(3)
                .forEach(entry -> System.out.println(entry.getKey().getAd() + ": " + entry.getValue()));
    }
    // oyuna puan ekleme
    public void oyunPuanEkle(Oyun oyun, double puan) {
        puanlar.put(oyun, puan);
    }
    
}
