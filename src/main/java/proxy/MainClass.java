package proxy;

import java.math.BigDecimal;

public class MainClass
{
    public static void main(String[] args)
    {
        Pay bank = new BankProxy();

        //all other bank methods are hidden so proxy pattern enables only some of bank features
        //based on shared interface and initialized hidden object in proxy
        bank.pay(BigDecimal.TEN);
    }
}
