import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        /*
        Scanner deger = new Scanner(System.in);
        boolean cikti = false;

        int [] dizi = {1,2,3,4,5,6,7,8,9};

        System.out.println("Bir sayı giriniz: ");

        int sayi = deger.nextInt();

        for(int i=0;i<9;i++)
        {
            if(sayi == dizi[i])
            {
                cikti = true;
                break;
            }
        }
        if(cikti)
        {
            System.out.println("Sayı dizinin içinde var");
        }
       else
       {
           System.out.println("Sayı dizinin içinde yok");
       }
       */
        /*
        Scanner girdi = new Scanner(System.in);

        System.out.println("Bir cümle girin: ");
        String cumle = girdi.nextLine();

        System.out.println("Değiştirilecek karakteri giriniz: ");
        String eskiKarakter = girdi.next();

        System.out.println("Yeni karakteri giriniz: ");
        String yeniKarakter = girdi.next();

        String yeniCumle = cumle.replace(eskiKarakter,yeniKarakter);

        System.out.println("Yeni cümleniz: "+yeniCumle);
        */
/*
        Scanner girdi = new Scanner(System.in);

        System.out.println("Dizinin boyutunu giriniz: ");

        int sayi = girdi.nextInt();

        int []dizi = new int[sayi];

        for(int i=0;i<sayi;i++)
        {
            System.out.println("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = girdi.nextInt();
        }
        int toplam =0;
        for(int i=0;i<sayi;i++)
        {
            toplam += dizi[i];
        }

        System.out.println("Dizinin elemanları toplamı: " +toplam);
*/
        /*
        int [][] matris = new int[5][3];
        int [] sutunToplamlari = new int[3];
        int [] veriler = {23,5,23,54,13,65,3,84,43,76,13,10,95,56,75};

        //sayıları matrise yerleştirme ve sütunları toplama
        int index = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                matris[i][j] = veriler[index];
                sutunToplamlari[j] += veriler[index];
                index++;
            }
        }
        //Matrisi yazma
        System.out.println("Matris: ");
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
        // Sütun toplamı

        System.out.println("Sütun toplamları: ");
        for(int j = 0; j < 3; j++)
        {
            System.out.println("Sütun " + (j + 1) + ":" + sutunToplamlari[j]);
        }

         */

        int n = 5;
        int m = 4;
        int [][] matris = new int[n][m];
        double[] satirOrtalamalari = new double[n];

        // Matris oluşturma ve satır ortalaması hesaplama
        Random random = new Random();
        for (int i = 0; i < n; i++)
        {
            int satirToplami = 0;
            for(int j = 0; j < m; j++)
            {
                matris[i][j] = random.nextInt(100) + 1;
                satirToplami += matris[i][j];
            }
            satirOrtalamalari[i] = (double) satirToplami / m;
        }
        // Matrisi yazma

        System.out.println("Matris: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
        //Satır ortalamalarını yazma

        System.out.println("Satır ortalamaları: ");

        for(int i = 0; i < n; i++)
        {
            System.out.println("Satır " + (i + 1) + "Ortalaması: " + satirOrtalamalari[i]);
        }

    }
}