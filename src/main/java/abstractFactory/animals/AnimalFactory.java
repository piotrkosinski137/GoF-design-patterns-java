package abstractFactory.animals;

import abstractFactory.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal>
{
    @Override
    public Animal create(String type)
    {
        if(type.equals("dog")) {
            return new Dog();
        } else if(type.equals("cat")) {
            return new Cat();
        }
        throw new RuntimeException("Animal not recognized");
    }
}
