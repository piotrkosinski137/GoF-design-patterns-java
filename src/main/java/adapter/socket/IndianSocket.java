package adapter.socket;

public class IndianSocket implements Socket
{
    @Override
    public Volt getVolt()
    {
        return new Volt(240);
    }
}
