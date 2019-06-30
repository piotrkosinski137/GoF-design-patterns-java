package abstractFactory.cars;

import abstractFactory.AbstractFactory;

public class CarFactory implements AbstractFactory<Car>
{
    @Override
    public Car create(String type)
    {
        if(type.equals("audi")) {
            return new Audi();
        } else if(type.equals("fiat")) {
            return new Fiat();
        }
        throw new RuntimeException("Car not recognized");
    }
}
