public class Main {
    public static void main(String[] args) {
        Siparis siparis = new Siparis("Eren Karakus",46);
        siparis.urunEkle(new SiparisOgeleri("Laptop",20,1200.0));
        siparis.urunEkle(new SiparisOgeleri("Keyboard",20,400.0));
        siparis.listeleyenMetot();
    }
}