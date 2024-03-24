public class Kamyon extends Arac{
    private Integer toplamAgirlik;

    public Kamyon() {
    }

    public Kamyon(String marka, String model, Integer maliyet, Integer uretimYili, Kullanici kullanici, Integer toplamAgirlik) {
        super(marka, model, maliyet, uretimYili, kullanici);
        this.toplamAgirlik = toplamAgirlik;
    }

    public Integer getToplamAgirlik() {
        return toplamAgirlik;
    }

    public void setToplamAgirlik(Integer toplamAgirlik) {
        this.toplamAgirlik = toplamAgirlik;
    }


    @Override
    public Integer satisFiyatiHesapla() {
        return getMaliyet() + getUretimYili() * 2 + getToplamAgirlik() * 6 ;
    }

    @Override
    public String toString() {
        return "Kamyon{" +
                "marka='" + getMarka() + '\'' +
                ", model='" + getModel() + '\'' +
                ", maliyet=" + getMaliyet() +
                ", uretimYili=" + getUretimYili() +
                ", kullanici=" + getKullanici().toString() +
                ", toplamAgirlik=" + toplamAgirlik +
                '}';
    }
}
