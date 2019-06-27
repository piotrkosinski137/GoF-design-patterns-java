package adapter.mph;

//implementation of khm calculator gave wrong value for EU and it returned wrong value type
//so we implement adapter method that runs incompatible implementation then converts result to
//desired value
public class MPHCalculatorAdapter implements MovableAdapter
{
    private Movable kmhCalculator;

    public MPHCalculatorAdapter(Movable kmhCalculator)
    {
        this.kmhCalculator = kmhCalculator;
    }

    //i am changing even return type if it's needed. In this case it makes no sense
    @Override
    public String getSpeedMph(int distance, int minutes)
    {
        double speedMph = convertToMph(kmhCalculator.getSpeedKmh(distance, minutes));

        return "Result is: " + speedMph;
    }

    private double convertToMph(double speedKmh)
    {
        return speedKmh * 0.621371;
    }
}
