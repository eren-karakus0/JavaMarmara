import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban giriniz: ");
        int taban = scanner.nextInt();
        System.out.println("Üs giriniz: ");
        int us = scanner.nextInt();
        System.out.println(taban + "^" + us + " = " + usAl(taban, us));
    }
    // Recursive üs alma fonksiyonu
    public static int usAl(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            // taban^us = taban * taban^(us-1)
            return taban * usAl(taban, us - 1);
        }
    }
}
