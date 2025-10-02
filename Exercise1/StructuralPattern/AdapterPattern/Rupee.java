package AdapterPattern;

public class Rupee implements Currency {
    private double amount;
    public Rupee(double amount)
    {
        this.amount=amount;
    }
    @Override
    public double getAmount() {

        return amount;
    }

}