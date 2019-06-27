package proxy;

import java.math.BigDecimal;

public class BankProxy implements Pay
{
    private Bank bank = new Bank();

    @Override
    public void pay(BigDecimal amount)
    {
        bank.pay(amount);
    }
}
