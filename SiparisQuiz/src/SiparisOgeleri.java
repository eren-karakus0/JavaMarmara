public class SiparisOgeleri {
    private String urunAdi;
    private int miktar;
    private double birimFiyat;

    public SiparisOgeleri(String urunAdi, int miktar, double birimFiyat){
        this.urunAdi = urunAdi;
        this.miktar = miktar;
        this.birimFiyat = birimFiyat;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public int getMiktar() {
        return miktar;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }
}
