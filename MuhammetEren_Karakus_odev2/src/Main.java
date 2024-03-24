import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Kullanıcı kullanıcı = new Kullanıcı("Kullanıcı adı" , "kullanıcı soyadı");

        sarki sarki1 = new sarki("Şarkı 1","Sanatçı 1","Albüm 1",100);
        sarki sarki2 = new sarki("Şarkı 2","Sanatçı 2","Albüm 2",200);
        kullanıcı.sarkiEkle(sarki1);
        kullanıcı.sarkiEkle(sarki2);

        System.out.println("Kullanıcının toplam şarkı süresi: "+kullanıcı.toplamSure() + " saniye");
        System.out.println("Kullanıcının şarkıları: ");
        for (sarki sarki : kullanıcı.sarkiListele()){
            System.out.println("Ad: "+sarki.getAd()+" Sanatçı: "+sarki.getSanatci()+"Albüm: "+sarki.getAlbum()+" Süre: "+sarki.getSure()+ " Saniye");
        }

        kullanıcı.sarkiSil(sarki1);

        System.out.println("Kullanıcının toplam şarkı süresi: "+ kullanıcı.toplamSure()+" Saniye");
        System.out.println("Kullanıcının şarkıları: ");
        for(sarki sarki : kullanıcı.sarkiListele()){
            System.out.println("Ad: "+sarki.getAd()+" Sanatçı: "+ sarki.getSanatci()+" Albüm: "+ sarki.getAlbum()+" Süre: "+sarki.getSure()+" Sabiye");
        }

        System.out.println("Şarkı arama sonuçları: ");
        ArrayList<sarki> bulunanSarkilar = kullanıcı.sarkiArama("Şarkı");
        for (sarki sarki : bulunanSarkilar){
            System.out.println("Ad: " + sarki.getAd()+ "Sanatçı: "+ sarki.getSanatci()+" Albüm: "+sarki.getAlbum()+" Süre: "+sarki.getSure()+" SAniye");
        }
    }
}