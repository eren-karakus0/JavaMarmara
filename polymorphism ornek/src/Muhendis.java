
import java.util.Random;

public class Muhendis extends Personel{

    public Muhendis(String ad, String soyad, double maas, int calisma_yili) {
        super(ad, soyad, maas, calisma_yili);
    }

    @Override
    public double zamIste() {
        double zam_talebi = Math.random() * 0.5;//0.0-1.0 0.0-0.5
        //Random r1 = new Random();
        double yeni_maas_talebi = this.getMaas() + (this.getMaas() * zam_talebi);
        return yeni_maas_talebi;
    }

}
