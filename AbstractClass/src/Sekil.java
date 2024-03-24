abstract class Sekil {
    // Soyut metot tanımı
    abstract double alanHesapla();

    //Normal metot tanımı
    void bilgiVer(){
        System.out.println("Bu bir şekildir");
    }
}
//Soyut sınıftan türetilen alt sınıf
class Dikdortgen extends Sekil{
    //Alt sınıfın soyut metodu uygulanıyor
    @Override
    double alanHesapla(){
        System.out.println("Dikdörtgenin alanı hesaplanıyor: ");
        return 4.0; //Örnek değer
    }
}
//Soyut sınıftan türetilen başka bir alt sınıf
class Ucgen extends Sekil{
    //Alt sınıfın soyut metodu uygulanıyor
    @Override
    double alanHesapla(){
        System.out.println("Üçgenin alanı hesaplanıyor: ");
        return 2.5; //Örnek değer
    }
}
