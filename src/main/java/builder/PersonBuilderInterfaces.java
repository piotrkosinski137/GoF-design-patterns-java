package builder;

public class PersonBuilderInterfaces
{
    public interface NameInterface
    {
        AgeInterface withName(String name);
    }

    public interface AgeInterface
    {
        HomeTownInterface withAge(int age);
    }

    public interface HomeTownInterface
    {
        Person andHomeTown(String hometown);
    }
}
