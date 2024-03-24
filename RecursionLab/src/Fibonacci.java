import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç elemanlı fibonacci dizisi istersiniz: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci serisi:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    // Recursive Fibonacci hesaplama fonksiyonu
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            // F(n) = F(n-1) + F(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
