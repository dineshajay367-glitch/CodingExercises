package CompositePattern;

public class Tester implements Employee{
    private String name;
    public Tester(String name)
    {
        this.name=name;
    }
    @Override
    public void showDetails(String intend) {
        System.out.println(intend+name+" is a Tester");

    }

}