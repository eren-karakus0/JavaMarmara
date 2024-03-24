import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kullanici k = new Kullanici("Tolga", "Buyuktanir", 0, new ArrayList<>());
        Otomobil o = new Otomobil ("toyota", "corolla", 700000, 2020, new Kullanici(),
                1798);

        Bayi b = new Bayi ("ToyotaGurses", 1992, 1000, new ArrayList<>());
        b.aracEkle(o);
        b.aracSat(o,k);
        k.aracListele();

        Kamyon kamyon = new Kamyon ("bmc", "bmc", 7000000, 2020, new Kullanici(),
                20000);
        b.aracEkle(kamyon);
        b.aracSat(kamyon,k);
        k.aracListele();
    }
}