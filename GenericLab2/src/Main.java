import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListManager<Integer> studentNo = new ListManager<>();
        studentNo.addList(54456545);
        studentNo.addList(13231123);
        studentNo.addList(79878998);
        ListManager<String> studentName = new ListManager<>();
        studentName.addList("Eren");
        studentName.addList("Ali");
        studentName.addList("Deniz");

        ArrayList<Integer> okulNo = studentNo.getList();
        ArrayList<String> studentInfo = studentName.getList();

        for(int i = 0;i < studentInfo.size(); i++)
        {
            System.out.println((i+1)+". Öğrenci Bilgisi \n Öğrenci NUmarası: "+okulNo.get(i)+"\n Öğrenci İsmi : "+studentInfo.get(i));
        }
    }
}