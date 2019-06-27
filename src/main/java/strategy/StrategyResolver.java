package strategy;


//create interface, then whole strategies should implement it
// strategy resolver gets one of strategies and executes task
public class StrategyResolver
{
    private ArithmeticOperation arithmeticOperation;

    public StrategyResolver(ArithmeticOperation arithmeticOperation)
    {
        this.arithmeticOperation = arithmeticOperation;
    }

    public int startEquation(int number1, int number2)
    {
        return arithmeticOperation.perform(number1, number2);
    }
}
