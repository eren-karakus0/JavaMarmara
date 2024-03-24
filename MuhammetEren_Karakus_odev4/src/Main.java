public class Main {
    public static void main(String[] args) {
        SahisMusteri sahisMusteri = new SahisMusteri("Eren", "Karakus", 4646, "5455852445");
        FirmaMusteri firmaMusteri = new FirmaMusteri("Karakus Ticaret", "Karakus", 6464, "5423179845");

        sahisMusteri.bilgiGoster();
        System.out.println("----------------------------");
        firmaMusteri.bilgiGoster();
    }
}
