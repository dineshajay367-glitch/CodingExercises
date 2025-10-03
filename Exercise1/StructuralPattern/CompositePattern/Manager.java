package CompositePattern;
import java.util.*;
import java.util.logging.Logger;

public class Manager implements Employee{
    private String name;
    private List<Employee>employees=new ArrayList<>();
    public Manager(String name)
    {
        this.name=name;
    }
    public void addEmployee(Employee emp)
    {
        employees.add(emp);
    }
    public void removeEmployee(Employee emp)
    {
        employees.remove(emp);
    }

    @Override
    public void showDetails(String intend) {
        System.out.println(intend+"Manager: "+name);
        for(Employee employee: employees)
        {
            employee.showDetails(intend+"  ");
        }

    }

}