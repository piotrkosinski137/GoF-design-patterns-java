package abstractFactory.cars;

public class Fiat implements Car
{
    @Override
    public void getVMax()
    {
        System.out.println("Fiat wiecej niz 100 nie jedzie");
    }
}
