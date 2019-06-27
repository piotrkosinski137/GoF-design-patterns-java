package strategy;

public class Miltiply implements ArithmeticOperation
{
    @Override
    public int perform(int number1, int number2)
    {
        return number1 * number2;
    }
}
