import java.util.ArrayList;

public class Mudur extends Personel{

    private double katsayi = 0.55;

    public Mudur(String ad, String soyad, int maas, int calisma_yili) {
        super(ad, soyad, maas, calisma_yili);
    }

    @Override
    public double zamIste() {
        double yeni_maas = this.getMaas() + (this.getMaas() * this.katsayi);
        return yeni_maas;
    }

    public void zamYap(ArrayList<Personel> personelListesi) {
        for (int i = 0; i < personelListesi.size(); i++) {
            Personel personel = personelListesi.get(i);
            double zamTalebi = personel.zamIste();
            personel.setMaas(zamTalebi);
        }
    }


}
