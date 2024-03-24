public class Toplama {
    public static void main(String[] args) {
        int[] dizi = {1,2,3,4,5,6};
        System.out.println("Dizi elemanlarının toplamı: " + diziToplami(dizi, 0));
    }
    // Recursive dizi elemanlarının toplamını hesaplama fonksiyonu
    public static int diziToplami(int[] dizi, int index) {
        if (index == dizi.length) {
            return 0;
        } else {
            // Eleman + diziToplami(dizi, index+1)
            return dizi[index] + diziToplami(dizi, index + 1);
        }
    }
}
