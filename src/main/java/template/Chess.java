package template;

public class Chess extends GameTemplate
{
    @Override
    void initialize()
    {
        System.out.println("two guys sits in front of a game");
    }

    @Override
    void startPlay()
    {
        System.out.println("first move with queen");
    }

    @Override
    void endPlay()
    {
        System.out.println("szach mat");
    }
}
