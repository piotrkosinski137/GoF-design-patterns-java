package builder;

public class PersonBuilder implements
        PersonBuilderInterfaces.NameInterface,
        PersonBuilderInterfaces.AgeInterface,
        PersonBuilderInterfaces.HomeTownInterface
{
    private Person person;

    PersonBuilder()
    {
        person = new Person();
    }

    @Override
    public PersonBuilderInterfaces.AgeInterface withName(String name)
    {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilderInterfaces.HomeTownInterface withAge(int age)
    {
        person.age = age;
        return this;
    }

    @Override
    public Person andHomeTown(String hometown)
    {
        person.homeTown = hometown;
        return person;
    }
}
