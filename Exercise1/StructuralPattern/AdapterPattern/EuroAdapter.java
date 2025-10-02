package AdapterPattern;

public class EuroAdapter implements Currency {
    private Euro euro;
    public EuroAdapter(Euro euro)
    {
        this .euro=euro;
    }
    @Override
    public double getAmount() {

        return euro.getEuro()*90;
    }

}