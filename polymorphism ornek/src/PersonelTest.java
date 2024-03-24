
import java.util.Scanner;

public class PersonelTest {
    public static void main(String[] args) {

        Firma firma1 = new Firma("A Firması", 2000);
        Firma f2 = new Firma ("Marmara", 1883);
        //Scanner scn = new Scanner (System.in);
        //System.out.println("Çalışan Adı Giriniz");
        //String ad = scn.nextLine();
        Mudur mudur = new Mudur("Ahmet", "Akar", 10500, 12);
        Personel muhendis = new Muhendis("Furkan", "Yıldırım", 6500, 3);
        Personel isci1 = new Isci("Ahmet", "Yıldız", 2500, 1);
        Personel isci2 = new Isci("Ayşe", "Sönmez", 4000, 6);

        firma1.personelEkle(mudur);
        firma1.personelEkle(muhendis);
        firma1.personelEkle(isci1);
        firma1.personelEkle(isci2);

        //muhendis.zamIste();
        //isci1.zamIste();
        //isci2.zamIste();

        Mudur m1 = new Mudur ("Ege", "Müdür", 12000, 2);
        m1.setAd("Emre");
        Muhendis muh1 = new Muhendis ("Tuna", "Mühendis", 9000, 2);
        f2.personelEkle(m1);
        f2.personelEkle(muh1);
        mudur.zamYap(firma1.getPersonelListesi());
        m1.zamYap(f2.getPersonelListesi());

        firma1.personelBilgiListele();
        f2.personelBilgiListele();

    }
}
