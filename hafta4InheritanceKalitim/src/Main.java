public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Damla mengüş","Yazılım",5000);
        employee.showInfos();


        Manager manager = new Manager("Damla mengüş","yazılım",5000,100);
        manager.showInfos();
        manager.riseSalary(500);
    }
}