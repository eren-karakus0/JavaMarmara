public class Main {
    public static void main(String[] args) {
        /*
        // 1. SORU
        int tek = 0;
        int cift = 0;

        for(int i = 0;i <= 50;i++)
        {
            if(i%2 == 0)
            {
                cift += i;
            }
            else
            {
                tek +=i;
            }
        }
        System.out.printf("1'den 50 ye kadar olan cift sayıların toplamı = \n",cift);
        System.out.printf("1'den 50 ye kadar olan tek sayıların toplamı = ",tek);
        */
        // 2. SORU

        int sayi = 12345;
        int no = 7 ;
        boolean deger = false;

        while(sayi > 0)
        {
            int hedef = sayi % 10;
            if(hedef == no )
            {
                deger = true;
            }
            sayi /= 10;
        }
        if(deger)
        {
            System.out.println(no + " rakamı girilen sayıda var.");
        }
        else {
            System.out.println(no + " rakamı girilen sayıda yok.");
        }
    }
}