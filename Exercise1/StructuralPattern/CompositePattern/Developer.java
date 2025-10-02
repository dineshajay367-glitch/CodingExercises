package CompositePattern;

public class Developer implements Employee{
    private String name;
    public Developer(String name)
    {
        this.name=name;
    }
    @Override
    public void showDetails(String intend) {
        System.out.println(intend+name+" is a Developer");

    }

}