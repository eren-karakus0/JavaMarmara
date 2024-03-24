class FirmaMusteri extends Musteri {
    private String vergiNumarasi;

    public FirmaMusteri(String ad, String soyad, int musteriNo, String vergiNumarasi) {
        super(ad, soyad, musteriNo);
        this.vergiNumarasi = vergiNumarasi;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Müşteri Türü: Firma Müşteri");
        super.bilgiGoster();
        System.out.println("Vergi Numarası: " + vergiNumarasi);
    }

    public String getVergiNumarasi() {
        return vergiNumarasi;
    }

    public void setVergiNumarasi(String vergiNumarasi) {
        this.vergiNumarasi = vergiNumarasi;
    }
}