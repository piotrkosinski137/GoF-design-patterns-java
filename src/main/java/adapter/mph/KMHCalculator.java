package adapter.mph;

public class KMHCalculator implements Movable
{
    @Override
    public double getSpeedKmh(int distance, int minutes)
    {
        return ((double) distance /(double) minutes) * 60;
    }
}
