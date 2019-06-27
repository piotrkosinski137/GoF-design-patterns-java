package decorator;

public abstract class ChristmasTreeDecorator implements Tree
{
    private Tree christmasTree;

    public ChristmasTreeDecorator(Tree christmasTree)
    {
        this.christmasTree = christmasTree;
    }

    @Override
    public void decorate()
    {
        christmasTree.decorate();
    }
}
