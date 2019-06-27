package proxy;

import java.math.BigDecimal;

public class BankProxy implements Pay
{
    private Bank bank = new Bank();
    //proxy can perform some additional housekeeping work when object
    //is accessed
    private int counter;

    @Override
    public void pay(BigDecimal amount)
    {
        bank.pay(amount);
        counter++;
    }
}
