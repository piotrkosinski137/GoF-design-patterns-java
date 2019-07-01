package flyweight;

//it's like factory for me
public class VocationFactory
{
    public VocationFactory()
    {
    }

    public Vocation getVocationFromFactory(VocationType vocationType)
    {
        switch (vocationType)
        {
            case KNIGHT:
                return new Knight();
            case PALADIN:
                return new Paladin();
            case DRUID:
                return new Druid();
            default:
                throw new RuntimeException("No vocation found with given type");
        }
    }

}
