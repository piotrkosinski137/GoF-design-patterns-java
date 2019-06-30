package abstractFactory;

import abstractFactory.animals.AnimalFactory;
import abstractFactory.cars.CarFactory;

public class FactoryProvider
{
    AbstractFactory getFactory(Choice choice)
    {
        if (Choice.ANIMAL == choice)
        {
            return new AnimalFactory();
        }
        else if (Choice.CAR == choice)
        {
            return new CarFactory();
        }

        throw new RuntimeException("No such factory implemented yet!");
    }
}
