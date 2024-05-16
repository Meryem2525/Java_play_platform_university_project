
package odev_1;


public class Arkadaslik {
        // arkadaşlık istegini gönder bölümü burada ekrana yazdırıyoruz

    public void arkadaslikIstegiGonder(Kullanici gonderen, Kullanici alan) {
        System.out.println(gonderen.getAdSoyad() + ", " + alan.getAdSoyad() + " kullanıcısına arkadaşlık isteği gönderdi.");
    }
    // arkadaşlık istegini kabul et bölümü burada ekrana yazdırıyoruz

    public void arkadaslikIstegiKabulEt(Kullanici kabulEden, Kullanici istekGonderen) {
        System.out.println(kabulEden.getAdSoyad() + ", " + istekGonderen.getAdSoyad() + " kullanıcısının arkadaşlık isteğini kabul etti.");
        kabulEden.arkadasEkle(istekGonderen);
        istekGonderen.arkadasEkle(kabulEden);
    }
    // arkadaşlık istegini reddet bölümü burada ekrana yazdırıyoruz
    public void arkadaslikIstegiReddet(Kullanici reddeden, Kullanici istekGonderen) {
        System.out.println(reddeden.getAdSoyad() + ", " + istekGonderen.getAdSoyad() + " kullanıcısının arkadaşlık isteğini reddetti.");
    }
}
