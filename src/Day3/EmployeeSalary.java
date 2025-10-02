package Day3;

public class EmployeeSalary {
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        EmployeeSalary emp = new EmployeeSalary();

        emp.setId(101);
        emp.setName("Arjun");
        emp.setSalary(55000);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: ₹" + emp.getSalary());
    }
}
