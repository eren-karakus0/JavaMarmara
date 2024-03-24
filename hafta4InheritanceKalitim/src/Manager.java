public class Manager extends Employee {
    private int num_of_employees;

    public Manager(String name, String department, int salary, int num_of_employees) {
        super(name, department, salary);
        this.num_of_employees = num_of_employees;
    }

    public void riseSalary(int amount) {
        System.out.println("Çalışanlara " + amount + " tl zam verildi.");
    }

    @Override

    public  void showInfos(){
        System.out.println("Name: "+ getName());
        System.out.println("Department: "+ getDepartment());
        System.out.println("Salary: "+ getSalary());
        System.out.println("Sorumlu kişi sayısı: "+ this.num_of_employees);
    }
}
