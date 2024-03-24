import java.util.ArrayList;

public class MuzikKoleksiyonu {

    public ArrayList<sarki> sarkilar;
    public MuzikKoleksiyonu(){
        sarkilar = new ArrayList<>();
    }
    public void sarkiEkle(sarki sarki){
        sarkilar.add(sarki);
    }
    public void sarkiSil(sarki sarki){
        sarkilar.remove(sarki);
    }
    public ArrayList<sarki> getSarkilar() {
        return sarkilar;
    }
    public int toplamSure(){
        int toplamSure = 0;
        for (sarki sarki : sarkilar){
            toplamSure += sarki.getSure();
        }
        return toplamSure;
    }

}
