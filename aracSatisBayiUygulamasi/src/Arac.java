public class Arac {
    private String marka;
    private String model;
    private Integer maliyet;
    private Integer uretimYili;
    private Kullanici kullanici;

    public Arac() {

    }

    public Arac(String marka, String model, Integer maliyet, Integer uretimYili, Kullanici kullanici) {
        this.marka = marka;
        this.model = model;
        this.maliyet = maliyet;
        this.uretimYili = uretimYili;
        this.kullanici = kullanici;
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMaliyet() {
        return maliyet;
    }

    public void setMaliyet(Integer maliyet) {
        this.maliyet = maliyet;
    }

    public Integer getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(Integer uretimYili) {
        this.uretimYili = uretimYili;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", maliyet=" + maliyet +
                ", uretimYili=" + uretimYili +
                ", kullanici=" + kullanici.toString() +
                '}';
    }

    public Integer satisFiyatiHesapla()
    {
        return maliyet;
    }
}
