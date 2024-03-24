import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyeli alınacak sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        long faktoriyel = faktoriyelHesapla(sayi);
        System.out.println(sayi + " sayısının faktöriyeli: " + faktoriyel);
    }
    // Recursive faktöriyel hesaplama fonksiyonu
    public static long faktoriyelHesapla(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // n! = n * (n-1)!
            return n * faktoriyelHesapla(n - 1);
        }
    }
}
