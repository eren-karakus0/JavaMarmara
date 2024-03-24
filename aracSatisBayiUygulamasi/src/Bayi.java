import java.util.ArrayList;

public class Bayi {
    private String ad;
    private Integer kurulusYili;
    private Integer uretilenAracSayisi;
    private ArrayList<Arac> araclar;

    public Bayi() {

    }

    public Bayi(String ad, Integer kurulusYili, Integer uretilenAracSayisi, ArrayList araclar) {
        this.ad = ad;
        this.kurulusYili = kurulusYili;
        this.uretilenAracSayisi = uretilenAracSayisi;
        this.araclar = araclar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Integer getKurulusYili() {
        return kurulusYili;
    }

    public void setKurulusYili(Integer kurulusYili) {
        this.kurulusYili = kurulusYili;
    }

    public Integer getUretilenAracSayisi() {
        return uretilenAracSayisi;
    }

    public void setUretilenAracSayisi(Integer uretilenAracSayisi) {
        this.uretilenAracSayisi = uretilenAracSayisi;
    }

    public ArrayList getAraclar() {
        return araclar;
    }

    public void setAraclar(ArrayList araclar) {
        this.araclar = araclar;
    }

    public void aracEkle (Arac arac){
        araclar.add(arac);
    }

    public void aracSat(Arac arac, Kullanici kullanici) {
        arac.setKullanici(kullanici);
        kullanici.setAracSayisi(kullanici.getAracSayisi()+1);
        kullanici.getSatinAlinanlar().add(arac);
    }

}

