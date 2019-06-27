package template;

public abstract class GameTemplate
{
    final void declareWillingToPlay()
    {
        System.out.println("I Want to play!");
    }

    final void appearOnPlayField()
    {
        System.out.println("Appeared to the place where I am going to play!");
    }

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void proceedGameWorkflow()
    {
        declareWillingToPlay();
        appearOnPlayField();
        initialize();
        startPlay();
        endPlay();

    }

}
