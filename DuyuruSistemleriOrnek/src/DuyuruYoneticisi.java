import java.util.ArrayList;
import java.util.List;
class DuyuruYoneticisi {
    private List<Duyuru> duyurular;

    public DuyuruYoneticisi() {
        this.duyurular = new ArrayList<>();
    }

    public void duyuruEkle(Duyuru duyuru) {
        duyurular.add(duyuru);
    }

    public List<Duyuru> getDuyurular() {
        return duyurular;
    }

    public List<Duyuru> kategoriyeGoreFiltrele(String kategori) {
        List<Duyuru> filtrelenmisDuyurular = new ArrayList<>();
        for (Duyuru duyuru : duyurular) {
            if (duyuru.getKategori().equalsIgnoreCase(kategori)) {
                filtrelenmisDuyurular.add(duyuru);
            }
        }
        return filtrelenmisDuyurular;
    }

    // Diğer işlevler buraya eklenebilir.
    // ...
}