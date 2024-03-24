import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DuyuruYoneticisi duyuruYoneticisi = new DuyuruYoneticisi();

        Duyuru duyuru1 = new Duyuru("Yeni Etkinlik", "Yarın yapılacak etkinlik için hazır olun!", new Date(), "Etkinlikler");
        Duyuru duyuru2 = new Duyuru("Acil Duyuru", "Önemli bir bilgilendirme metni...", new Date(), "Acil");
        Duyuru duyuru3 = new Duyuru("Duyuru", "Bir diğer duyuru...", new Date(), "Genel");

        duyuruYoneticisi.duyuruEkle(duyuru1);
        duyuruYoneticisi.duyuruEkle(duyuru2);
        duyuruYoneticisi.duyuruEkle(duyuru3);

        List<Duyuru> tumDuyurular = duyuruYoneticisi.getDuyurular();
        for (Duyuru duyuru : tumDuyurular) {
            System.out.println(duyuru);
        }

        // Belirli bir kategoriye göre filtrelenmiş duyuruları gösterme
        System.out.println("\nEtkinlikler Kategorisi:");
        List<Duyuru> etkinlikDuyurulari = duyuruYoneticisi.kategoriyeGoreFiltrele("Etkinlikler");
        for (Duyuru duyuru : etkinlikDuyurulari) {
            System.out.println(duyuru);
        }
    }
}
