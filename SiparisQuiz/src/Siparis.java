import java.util.ArrayList;
import java.util.Date;

public class Siparis {
    private String musteriAdi;
    private int siparisNo;
    private Date siparisTarihi;
    private ArrayList<SiparisOgeleri>siparisUrunleri;

    public Siparis(String musteriAdi, int siparisNo){
        this.musteriAdi = musteriAdi;
        this.siparisNo = siparisNo;
        this.siparisTarihi = new Date();
        this.siparisUrunleri = new ArrayList<>();
    }
    public void urunEkle(SiparisOgeleri siparisOgeleri){
        siparisUrunleri.add(siparisOgeleri);
    }

    public double hesaplaToplamFiyat(){
        double toplamFiyat = 0.0;

        for(SiparisOgeleri siparisOgeleri : siparisUrunleri){
            toplamFiyat += siparisOgeleri.getBirimFiyat() * siparisOgeleri.getMiktar();
        }
        return toplamFiyat;
    }

    public void listeleyenMetot(){
        System.out.println("Müşteri adı: " + musteriAdi);
        System.out.println("Sipariş no: " + siparisNo);
        System.out.println("Sipariş tarihi: " + siparisTarihi);
        System.out.println("------------");
        System.out.println("Ürünler:");

        for(SiparisOgeleri siparisOgeleri : siparisUrunleri){
            System.out.println("Ürün adı: " + siparisOgeleri.getUrunAdi());
            System.out.println("Ürün miktarı: " + siparisOgeleri.getMiktar());
            System.out.println("Ürün fiyatı: " + siparisOgeleri.getBirimFiyat());
        }
        System.out.println("Toplam fiyat: " + hesaplaToplamFiyat() + "TL");
    }

}
