public class Personel {

    private String ad;
    private String soyad;
    private double maas;
    private int calisma_yili;

    public Personel(String ad, String soyad, double maas, int calisma_yili) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        this.calisma_yili = calisma_yili;
    }

    public double zamIste() {
        return -1;
    }

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public double getMaas() {
        return maas;
    }
    public void setMaas(double maas) {
        this.maas = maas;
    }
    public int getCalisma_yili() {
        return calisma_yili;
    }
    public void setCalisma_yili(int calisma_yili) {
        this.calisma_yili = calisma_yili;
    }


}
