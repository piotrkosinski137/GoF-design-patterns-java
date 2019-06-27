package decorator;

public class Lancuch extends ChristmasTreeDecorator
{
    public Lancuch(Tree christmasTree)
    {
        super(christmasTree);
    }

    @Override
    public void decorate()
    {
        super.decorate();
        System.out.println("adding lancuch!");
    }
}
