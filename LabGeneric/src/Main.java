import java.util.Arrays;

public class Main {
    public static <T extends Comparable<T>> void siralaVeYazdir(T[] dizi) {
        Arrays.sort(dizi);
        for (T eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Farklı tiplerde array'ler
        Integer[] intDizi = {5, 2, 9, 1, 3};
        Double[] doubleDizi = {3.5, 1.2, 9.8, 2.1, 5.6};
        String[] stringDizi = {"elma", "armut", "çilek", "muz", "portakal"};

        // Sıralama ve yazdırma
        System.out.println("Integer Dizisi:");
        siralaVeYazdir(intDizi);

        System.out.println("Double Dizisi:");
        siralaVeYazdir(doubleDizi);

        System.out.println("String Dizisi:");
        siralaVeYazdir(stringDizi);
    }
}
