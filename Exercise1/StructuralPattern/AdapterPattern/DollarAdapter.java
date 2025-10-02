package AdapterPattern;

public class DollarAdapter implements Currency {
    private Dollar dollar;
    public DollarAdapter(Dollar dollar)
    {
        this .dollar=dollar;
    }
    @Override
    public double getAmount() {

        return dollar.getDollar()*84;
    }

}