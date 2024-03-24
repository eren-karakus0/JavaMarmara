import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");

        int num = reader.nextInt();
        int sayac = num;
        long faktoriyel = 1;
        while(sayac > 1)
        {
            faktoriyel *=sayac;
            sayac--;
        }
        System.out.printf("%d Sayısının faktöriyeli : %d", num , faktoriyel);
    }
}