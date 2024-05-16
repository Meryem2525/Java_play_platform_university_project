
package odev_1;


public class Odev_1 {

    
    public static void main(String[] args) {
        
        
  // Kullanıcılar oluşturduk  ad,soyad,kullanici Adi, sifre,mail alanlarını kullanıcıdan giridik
  
        Kullanici kullanici1 = new Kullanici("Meyrema", "Aybil", "aybil25", "aybil25", "meyrema25@example.com");
        Kullanici kullanici2 = new Kullanici("Kader", "Aslan", "kader25", "kader25", "kader@example.com");
        Kullanici kullanici3 = new Kullanici("Rukiye", "Toker", "rukiye123", "rukiay25", "aybilrukiye@example.com");
        

        // Oyunların ad, açıklama türünü ve  ekstra fiyatınıda  koyduk 
        
        Oyun oyun1 = new Oyun("Counter Strike", "Aksiyon oyunu", "FPS", 60.0);
        Oyun oyun2 = new Oyun("Minecraft", "3D oyunu", "Sandbox", 70.0);
        Oyun oyun3 = new Oyun("Sudoko", "Mantık oyunu", "Bulmaca", 5.0);

        // Arkadaş isteği gönder ,reddet ve kabul et kısımları
        
        Arkadaslik arkadaslik = new Arkadaslik();
        arkadaslik.arkadaslikIstegiGonder(kullanici1, kullanici2);
        arkadaslik.arkadaslikIstegiKabulEt(kullanici2, kullanici1);
        arkadaslik.arkadaslikIstegiReddet(kullanici3, kullanici1);

        // Kullanıcı bilgileri 
        
        kullanici1.kullaniciBilgisi();
        kullanici1.oyunSatınAl(oyun1);
        kullanici1.oyunSatınAl(oyun2);
        kullanici1.oyunSatınAl(oyun3);

        kullanici1.arkadaslariGoster();
        kullanici1.oyunlariGoster();

        // Oyun bilgileri yapıldı diğer oyun bilgilerini girebilirsin
        
        oyun1.oyunDetay();
        oyun1.oyunDegerlendir(8.5);
        oyun1.oyunculariListele();
        
        // Puan tablo kısımları 
        
        PuanTablosu puanTablosu = new PuanTablosu();
        puanTablosu.oyunPuanEkle(oyun1, 3.5);
        puanTablosu.oyunPuanEkle(oyun2, 6.8);
        puanTablosu.oyunPuanEkle(oyun3, 5.1);

        puanTablosu.puanTablosuGoruntule();
        puanTablosu.enIyiOyunlar();
    }
    }
    

