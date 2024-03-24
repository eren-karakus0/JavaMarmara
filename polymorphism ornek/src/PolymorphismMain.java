
public class PolymorphismMain {
    public static void main(String[] args) {
        // Çalışan Eklemeleri Yapalım:
        Employee mert = new Employee("Mert","Çağlayan");
        Employee oguz = new Employee("Oğuz","Kaynarca",3500);
        Employee omer = new Engineer("Ömer Faruk","Yıldız",1500);
        Employee oktay = new Engineer("Oktay","Güden",12000);
        // Ekrana Yazdırma İşlemi Uygulaylaım:
        System.out.println("-------------------");
        mert.infoBox();
        oguz.infoBox();
        omer.infoBox();
        oktay.infoBox();
    }
}
