package Day4;

public class EmployeeBonus {
    void getBonus(){
        System.out.println("Bonus");
    }
}
class Manager extends EmployeeBonus{
    @Override
    void getBonus(){
        System.out.println("Manager Bonus:10000");
    }
}
class Developer extends EmployeeBonus{
    @Override
    void getBonus(){
        System.out.println("Developer Bonus:7000");
    }
}
class Bonus{
    public static void main(String[] args) {
        EmployeeBonus e1=new EmployeeBonus();
        e1.getBonus();
        EmployeeBonus e2=new Manager(),e3=new Developer();
        e2.getBonus();
        e3.getBonus();
    }
}
