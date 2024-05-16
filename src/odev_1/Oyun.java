/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev_1;

import java.util.ArrayList;
import java.util.List;


public class Oyun {
      String ad;
     String aciklama;
     String tur;
     double fiyat;
     double derece;
     List<Kullanici> oyuncular;
     
     // Consturctor bölümü
    public Oyun(String ad, String aciklama, String tur, double fiyat) {
        this.ad = ad;
        this.aciklama = aciklama;
        this.tur = tur;
        this.fiyat = fiyat;
        this.derece = 0;
        this.oyuncular = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

        // detay kısımlarını ekrana yazdırmak
    public void oyunDetay() {
        System.out.println("Oyun Adı: " + ad);
        System.out.println("Açıklama: " + aciklama);
        System.out.println("Tür: " + tur);
        System.out.println("Fiyat: " + fiyat);
    }
        // puanı consturctor 
    public void oyunDegerlendir(double puan) {
        this.derece = puan;
    }

    //  oyuncuları listeliyoruz 
    public void oyunculariListele() {
        System.out.println("Oyunu Oynayan Kullanıcılar:");
        for (Kullanici kullanici : oyuncular) {
            System.out.println("- " + kullanici.getAdSoyad());
        }
    }
         // oyuncu ekle bölümü
    public void oyuncuEkle(Kullanici kullanici) {
        oyuncular.add(kullanici);
    }

   
    
}
