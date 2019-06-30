package builder;

public class Person
{
    String name;
    int age;
    String homeTown;

    Person()
    {
    }

    public static PersonBuilderInterfaces.NameInterface create()
    {
        return new PersonBuilder();
    }

    public String name()
    {
        return name;
    }

    public int age()
    {
        return age;
    }

    public String homeTown()
    {
        return homeTown;
    }
}
