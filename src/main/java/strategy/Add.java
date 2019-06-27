package strategy;

public class Add implements ArithmeticOperation
{
    @Override
    public int perform(int number1, int number2)
    {
        return number1 + number2;
    }
}
