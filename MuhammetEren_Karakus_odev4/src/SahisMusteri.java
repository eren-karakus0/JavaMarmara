class SahisMusteri extends Musteri {
    private String telefonNumarasi;

    public SahisMusteri(String ad, String soyad, int musteriNo, String telefonNumarasi) {
        super(ad, soyad, musteriNo);
        this.telefonNumarasi = telefonNumarasi;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Müşteri Türü: Şahıs Müşteri");
        super.bilgiGoster();
        System.out.println("Telefon Numarası: " + telefonNumarasi);
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
}
