class Musteri {
    private String ad;
    private String soyad;
    private int musteriNo;

    public Musteri(String ad, String soyad, int musteriNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.musteriNo = musteriNo;
    }

    public void bilgiGoster() {
        System.out.println("Müşteri Adı: " + ad);
        System.out.println("Müşteri Soyadı: " + soyad);
        System.out.println("Müşteri Numarası: " + musteriNo);
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

    public int getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(int musteriNo) {
        this.musteriNo = musteriNo;
    }
}
