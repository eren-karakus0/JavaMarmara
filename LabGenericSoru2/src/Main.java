import java.util.ArrayList;

class Ogrenci {
    private int ogrenciNo;
    private String ad;
    private String soyad;

    public Ogrenci(int ogrenciNo, String ad, String soyad) {
        this.ogrenciNo = ogrenciNo;
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Öğrenci No: " + ogrenciNo + ", Ad: " + ad + ", Soyad: " + soyad;
    }
}

class ListManager<T> {
    private ArrayList<T> liste;

    public ListManager() {
        this.liste = new ArrayList<>();
    }

    public void ekle(T eleman) {
        liste.add(eleman);
    }

    public void yazdir() {
        for (T eleman : liste) {
            System.out.println(eleman);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ListManager<Ogrenci> ogrenciListesi = new ListManager<>();

        // Öğrenci bilgilerini ekleyelim
        ogrenciListesi.ekle(new Ogrenci(1, "Ahmet", "Yılmaz"));
        ogrenciListesi.ekle(new Ogrenci(2, "Ayşe", "Kaya"));
        ogrenciListesi.ekle(new Ogrenci(3, "Mehmet", "Demir"));

        // Öğrenci listesini ekrana yazdıralım
        System.out.println("Öğrenci Listesi:");
        ogrenciListesi.yazdir();
    }
}
