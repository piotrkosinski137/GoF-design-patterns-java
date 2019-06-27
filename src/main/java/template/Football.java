package template;

public class Football extends GameTemplate
{
    @Override
    void initialize()
    {
        System.out.println("11 players each are on both sides");
    }

    @Override
    void startPlay()
    {
        System.out.println("first kick of the ball");
    }

    @Override
    void endPlay()
    {
        System.out.println("Referee Whistles, everybody are tired af");
    }
}
