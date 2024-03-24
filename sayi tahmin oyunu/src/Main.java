import java.util.Random;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Sayı tahmin oyununa hoşgeldiniz: ");
        System.out.println("Lütfen 1-100 arasında bir sayi giriniz : ");
        // kullanıcıdan sayı alıyoruz.
        int tahmin = input.nextInt();
        // bilgisayardan sayı alıyoruz
        int sayi = rnd.nextInt(101);

        while(tahmin != sayi)
        {
            if(tahmin < 0 || tahmin > 100)
            {
                System.out.println("1-100 arasında bir sayı giriniz: ");
                tahmin = input.nextInt();
            }
            else if (tahmin < sayi)
            {
                System.out.println("Daha büyük bir sayi giriniz: ");
                tahmin = input.nextInt();
            }
            else
            {
                System.out.println("Daha küçük bir sayı giriniz: ");
                tahmin = input.nextInt();
            }
        }

        System.out.println("Tebrikler kazandınız!!! ");
    }
}