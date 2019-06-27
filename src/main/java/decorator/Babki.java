package decorator;

public class Babki extends ChristmasTreeDecorator
{
    public Babki(final Tree christmasTree)
    {
        super(christmasTree);
    }

    @Override
    public void decorate()
    {
        super.decorate();
        System.out.println("adding bąbki");
    }
}
