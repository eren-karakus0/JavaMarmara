import java.util.ArrayList;

public class Main {
    public static void toplama(int a,int b,int c) {
        System.out.println("Toplamları: "+(a+b+c));
    }
    public static void cikarma(int a,int b) {
        System.out.println("Farkları: "+(a-b));
    }
    public static void skorHesapla(String name,int skor) {
        System.out.println(name + " isimli ohyuncunun puanı: "+skor);
    }
    public static void main(String[] args){
        toplama(3,4,5);
        cikarma(9,7);
        skorHesapla("Sawyer",42);

        ArrayList<String> marvel = new ArrayList<>();

        marvel.add("iron man");
        marvel.add("spider man");
        marvel.add("thor");
        marvel.add("cap");

        for (int i = 0; i < marvel.size(); i++)
        {
            System.out.println("Marvel members: "+marvel.get(i));
        }
        marvel.remove("spider man");
        marvel.remove(3);

        for (int i = 0; i < marvel.size(); i++)
        {
            System.out.println("marvel members: "+marvel.get(i));
        }

    }
}