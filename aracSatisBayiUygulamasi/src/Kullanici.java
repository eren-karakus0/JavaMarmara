import java.util.ArrayList;
import java.util.Objects;

public class Kullanici {
    private String ad;
    private String soyad;
    private Integer aracSayisi;
    private ArrayList<Arac> satinAlinanlar;

    public Kullanici() {

    }

    public Kullanici(String ad, String soyad, Integer aracSayisi, ArrayList satinAlinanlar) {
        this.ad = ad;
        this.soyad = soyad;
        this.aracSayisi = aracSayisi;
        this.satinAlinanlar = satinAlinanlar;
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

    public Integer getAracSayisi() {
        return aracSayisi;
    }

    public void setAracSayisi(Integer aracSayisi) {
        this.aracSayisi = aracSayisi;
    }

    public ArrayList getSatinAlinanlar() {
        return satinAlinanlar;
    }

    public void setSatinAlinanlar(ArrayList satinAlinanlar) {
        this.satinAlinanlar = satinAlinanlar;
    }

    public void aracListele() {
        System.out.println(getAd() + getSoyad() +"'in aldigi araclar:");
        for (int i = 0; i < getSatinAlinanlar().size(); i++) {
            Object arac = null;
            if(Objects.equals(getSatinAlinanlar().get(i).getClass().getCanonicalName(), "Otomobil"))
            {
                arac = (Otomobil) getSatinAlinanlar().get(i);
            }
            else if(Objects.equals(getSatinAlinanlar().get(i).getClass().getCanonicalName(), "Kamyon"))
            {
                arac = (Kamyon) getSatinAlinanlar().get(i);
            }
            System.out.println(arac.toString());
        }
    }
}
