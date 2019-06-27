package decorator;

public class ChristmasTree implements Tree
{
    @Override
    public void decorate()
    {
        System.out.println("tree without decoration");
    }
}
