package CompositePattern;

public class CompositePatternMain {

    public static void main(String[] args) {
        Employee employee1=new Developer("Dinesh");
        Employee employee2=new Tester("Kumar");
        Employee employee3=new Developer("ajay");
        Manager manager1=new Manager("vijay");
        Manager manager2=new Manager("Ajith");
        manager1.addEmployee(employee1);
        manager1.addEmployee(employee2);
        manager2.addEmployee(employee3);
        Manager generalmanager=new Manager("Rajini");
        generalmanager.addEmployee(manager1);
        generalmanager.addEmployee(manager2);
        generalmanager.showDetails("");



    }

}