import java.util.Date;

public class Duyuru {
    private String baslik;
    private String icerik;
    private Date yayinTarihi;
    private String kategori;

    public Duyuru(String baslik, String icerik, Date yayinTarihi, String kategori) {
        this.setBaslik(baslik);
        this.setIcerik(icerik);
        this.setYayinTarihi(yayinTarihi);
        this.setKategori(kategori);
    }

    // Getter ve setter metotları burada olabilir.

    @Override
    public String toString() {
        return "Başlık: " + getBaslik() + "\nİçerik: " + getIcerik() + "\nYayın Tarihi: " + getYayinTarihi() + "\nKategori: " + getKategori() + "\n";
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public Date getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(Date yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}