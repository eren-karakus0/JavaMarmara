import java.util.ArrayList;

public class Kullanıcı {
    public String ad;
    public String soyad;
    public MuzikKoleksiyonu koleksiyonu;

    public Kullanıcı(String ad, String soyad){
        ad = ad;
        soyad = soyad;
        koleksiyonu = new MuzikKoleksiyonu();
    }
    public void sarkiEkle(sarki sarki){
        koleksiyonu.sarkiEkle(sarki);
    }
    public void sarkiSil(sarki sarki){
        koleksiyonu.sarkiSil(sarki);
    }
    public ArrayList<sarki> sarkiListele(){
        return koleksiyonu.getSarkilar();
    }
    public ArrayList<sarki> sarkiArama(String arananSarki){
        ArrayList<sarki> bulunanSarki = new ArrayList<>();
        for (sarki sarki : koleksiyonu.getSarkilar()){
            if(sarki.getAd().contains(arananSarki)){
                bulunanSarki.add(sarki);
            }
        }
        return bulunanSarki;
    }
    public int toplamSure(){
        return koleksiyonu.toplamSure();
    }

}
