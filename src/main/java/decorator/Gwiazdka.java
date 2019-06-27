package decorator;

public class Gwiazdka extends ChristmasTreeDecorator
{
    public Gwiazdka(Tree christmasTree)
    {
        super(christmasTree);
    }

    @Override
    public void decorate()
    {
        super.decorate();
        System.out.println("adding gwiazdka");
    }
}
