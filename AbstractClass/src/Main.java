public class Main {
    public static void main(String[] args) {
        //Soyut sınıfın nesnesi oluşturulamaz ancak alt sınıfların nesnesini oluşturabiliriz
        Sekil dikdortgen = new Dikdortgen();
        Sekil ucgen = new Ucgen();

        // Her iki nesne de ortak olan soyut metodu çağırabilir
        System.out.println("Dikdörgen alanı: " + dikdortgen.alanHesapla());
        System.out.println("Üçgenin alanı: "+ ucgen.alanHesapla());

        //Normal metodları çağırabilirler
        dikdortgen.bilgiVer();
        ucgen.bilgiVer();
    }
}