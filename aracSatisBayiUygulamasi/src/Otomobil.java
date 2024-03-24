public class Otomobil extends Arac {
    private int silindirHacmi;

    public Otomobil() {
    }

    public Otomobil(String marka, String model, Integer maliyet, Integer uretimYili, Kullanici kullanici, int silindirHacmi) {
        super(marka, model, maliyet, uretimYili, kullanici);
        this.silindirHacmi = silindirHacmi;
    }

    public int getSilindirHacmi() {
        return silindirHacmi;
    }

    public void setSilindirHacmi(int silindirHacmi) {
        this.silindirHacmi = silindirHacmi;
    }


    @Override
    public Integer satisFiyatiHesapla() {
        return getMaliyet() + getUretimYili() * 2 + getSilindirHacmi() * 3 ;
    }

    @Override
    public String toString() {
        return "Otomobil{" +
                "marka='" + getMarka() + '\'' +
                ", model='" + getModel() + '\'' +
                ", maliyet=" + getMaliyet() +
                ", uretimYili=" + getUretimYili() +
                ", kullanici=" + getKullanici().toString() +
                ", silindirHacmi=" + silindirHacmi +
                '}';
    }
}
