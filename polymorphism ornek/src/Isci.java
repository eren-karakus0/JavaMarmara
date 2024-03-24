
public class Isci extends Personel{

    public Isci(String ad, String soyad, double maas, int calisma_yili) {
        super(ad, soyad, maas, calisma_yili);
    }

    @Override
    public double zamIste() {
        double zam_talebi = Math.random() * 0.5;
        double yeni_maas_talebi = this.getMaas() + (this.getMaas() * zam_talebi);
        return yeni_maas_talebi;
    }
}
