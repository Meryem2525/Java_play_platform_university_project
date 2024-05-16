
package odev_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Kullanici {
     String ad;
     String soyad;
     String kullaniciAdi;
     String sifre;
     String email;
     List<Oyun> satinAlinanOyunlar;
     Map<Oyun, Double> oyunPuanlari;
     List<Kullanici> arkadaslar;
     
     //Constructor bölümü 
     
    public Kullanici(String ad, String soyad, String kullaniciAdi, String sifre, String email) {
        this.ad = ad;
        this.soyad = soyad;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.email = email;
        this.satinAlinanOyunlar = new ArrayList<>();
        this.oyunPuanlari = new HashMap<>();
        this.arkadaslar = new ArrayList<>();
    }

    public String getAdSoyad() {
        return ad + " " + soyad;
    }
        // kullanıcı bilgilerin ekrana yazdırma 
    public void kullaniciBilgisi() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Kullanıcı Adı: " + kullaniciAdi);
        System.out.println("E-posta: " + email);
    }
    
    public void oyunSatınAl(Oyun oyun) {
        satinAlinanOyunlar.add(oyun);
    }

    public void arkadasEkle(Kullanici kullanici) {
        arkadaslar.add(kullanici);
    }

    public void oyunlariGoster() {
        System.out.println("Satın Alınan Oyunlar:");
        for (Oyun oyun : satinAlinanOyunlar) {
            System.out.println("- " + oyun.getAd());
        }
    }
    // oyun puanlama kısımları
    public void oyunuPuanla(Oyun oyun, double puan) {
        if (satinAlinanOyunlar.contains(oyun)) {
            oyunPuanlari.put(oyun, puan);
            oyun.oyuncuEkle(this);
        } else {
            System.out.println("Bu oyunu satın almadınız!");
        }
    }
    // arkadaş göster bölümü
    public void arkadaslariGoster() {
        System.out.println("Arkadaşlar:");
        for (Kullanici arkadas : arkadaslar) {
            System.out.println("- " + arkadas.getAdSoyad());
        }
    }
    
}
