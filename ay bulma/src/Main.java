import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay_no = 5;
        // yazdırılacak ay değeri
        String ayDegeriStr = null;
        switch(ay_no)
        {
            case 1: ayDegeriStr = "Ocak";
                break;
            case 2: ayDegeriStr = "Şubat";
                break;
            case 3: ayDegeriStr = "Mart";
                break;
            case 4: ayDegeriStr = "Nisan";
                break;
            case 5: ayDegeriStr = "Mayıs";
                break;
            case 6: ayDegeriStr = "Haziran";
                break;
            case 7: ayDegeriStr = "Temmuz";
                break;
            case 8: ayDegeriStr = "Ağustos";
                break;
            case 9: ayDegeriStr = "Eylül";
                break;
            case 10: ayDegeriStr = "Ekim";
                break;
            case 11: ayDegeriStr = "Kasım";
                break;
            case 12: ayDegeriStr = "Aralık";
                break;
            default:
                System.out.println("Yanlış değer girdiniz:");
        }
        System.out.println("Seçilen ay : "+ ayDegeriStr);
    }
}